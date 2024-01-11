package Gra_BusquedaSecyBin_GualpaMathias;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


public class Gra_BusquedaSecyBin_GualpaMathias extends JFrame {

    private JTextField tamañoArregloTextField;
    private JTextField numeroTextField;
    private DefaultTableModel modeloTabla;
    private MenuGrafica menuPanel;
    public JPanel panel;

    public Gra_BusquedaSecyBin_GualpaMathias() {
               // Configurar la ventana principal
        setTitle("Búsqueda Secuencial con Interfaz Gráfica");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes del formulario
        tamañoArregloTextField = new JTextField(5);
        numeroTextField = new JTextField(20);
        JButton crearArregloButton = new JButton("Crear Arreglo");
        crearArregloButton.setBackground(Color.cyan);
        JButton ordenarArregloButton = new JButton("Ordenar Arreglo");
        ordenarArregloButton.setBackground(Color.cyan);
        JLabel labelBuscar = new JLabel("Ingrese el número a buscar:");
        labelBuscar.setForeground(Color.WHITE);
        // Configurar la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Numeros del arreglo");

        JTable tablaNumeros = new JTable(modeloTabla);
        tablaNumeros.setBackground(Color.cyan);
        JScrollPane scrollPane = new JScrollPane(tablaNumeros);

        // Crear el panel de menú
        menuPanel = new MenuGrafica(this);

        // Configurar el diseño del formulario
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(250);

        JPanel panelIzquierdo = new JPanel(new FlowLayout());
        panelIzquierdo.setBackground(Color.GRAY);
        panelIzquierdo.add(tamañoArregloTextField);
        panelIzquierdo  .add(crearArregloButton);
        panelIzquierdo.add(ordenarArregloButton);
        panelIzquierdo.add(labelBuscar);
        panelIzquierdo.add(numeroTextField);
        

        JPanel panelDerecho = new JPanel(new BorderLayout());
        panelDerecho.add(scrollPane, BorderLayout.CENTER);

        splitPane.setLeftComponent(panelIzquierdo);
        splitPane.setRightComponent(panelDerecho);

        // Agregar el panel de menú al contenedor principal
        add(menuPanel, BorderLayout.NORTH);
        add(splitPane);

        // Configurar acciones de los botones
        crearArregloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearArreglo();
            }
        });

        ordenarArregloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenarArreglo();
            }
        });

        // Configurar el texto del botón en el menú según la selección
        menuPanel.getOpcionesBusqueda().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) menuPanel.getOpcionesBusqueda().getSelectedItem();
                menuPanel.setButtonText("Ejecutar " + seleccion);
            }
        });
    }

    private void crearArreglo() {
        try {
            int tamaño = Integer.parseInt(tamañoArregloTextField.getText());
            modeloTabla.setRowCount(0); // Limpiar la tabla

            for (int i = 0; i < tamaño; i++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la posición " + (i + 1) + ":"));
                modeloTabla.addRow(new Object[]{numero});
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un tamaño de arreglo válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ordenarArreglo() {
        try {
            int filas = modeloTabla.getRowCount();

            int[] arreglo = new int[filas];

            for (int i = 0; i < filas; i++) {
                arreglo[i] = (int) modeloTabla.getValueAt(i, 0);
            }

            // Ordenar el arreglo utilizando el algoritmo de burbuja
            for (int i = 0; i < filas - 1; i++) {
                for (int j = 0; j < filas - i - 1; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        // intercambiar arreglo[j] y arreglo[j + 1]
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                    }
                }
            }

            // Mostrar el arreglo ordenado en la tabla
            modeloTabla.setRowCount(0); // Limpiar la tabla
            for (int i = 0; i < filas; i++) {
                modeloTabla.addRow(new Object[]{arreglo[i]});
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error al ordenar el arreglo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void busquedaSecuencial() {
        try {
            int dato = Integer.parseInt(numeroTextField.getText());

            int filas = modeloTabla.getRowCount();
            boolean encontrado = false;

            for (int i = 0; i < filas; i++) {
                int numero = (int) modeloTabla.getValueAt(i, 0);
                if (numero == dato) {
                    encontrado = true;
                    
                    JOptionPane.showMessageDialog(this, "El número se encontró en la posición: " + i + " Hecho por la busqueda secuencial");
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "El número no se encontró en el arreglo");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void busquedaBinaria() {
        try {
            int dato = Integer.parseInt(numeroTextField.getText());

            int filas = modeloTabla.getRowCount();
            int[] arreglo = new int[filas];

            for (int i = 0; i < filas; i++) {
                arreglo[i] = (int) modeloTabla.getValueAt(i, 0);
            }

            // Ordenar el arreglo utilizando el algoritmo de burbuja
            for (int i = 0; i < filas - 1; i++) {
                for (int j = 0; j < filas - i - 1; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        // intercambiar arreglo[j] y arreglo[j + 1]
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                    }
                }
            }

            // Realizar búsqueda binaria en el arreglo ordenado
            int infe = 0;
            int sup = filas;
            int mitad;
            boolean encontrado = false;

            while (infe < sup) {
                mitad = (infe + sup) / 2;

                if (arreglo[mitad] == dato) {
                    encontrado = true;
                    JOptionPane.showMessageDialog(this, "El número se encontró en la posición: " + mitad + " Hecho por la busqueda binaria");
                    break;
                } else if (arreglo[mitad] > dato) {
                    sup = mitad;
                } else {
                    infe = mitad + 1;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "El número no se encontró en el arreglo");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Gra_BusquedaSecyBin_GualpaMathias ventana = new Gra_BusquedaSecyBin_GualpaMathias();
                ventana.setVisible(true);
            }
        });
    }
}