/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gra_BusquedaSecyBin_GualpaMathias;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class MenuGrafica extends JPanel {
        private JComboBox<String> opcionesBusqueda;
    private JButton ejecutarButton;
    private Gra_BusquedaSecyBin_GualpaMathias ventanaPrincipal;

    public MenuGrafica(Gra_BusquedaSecyBin_GualpaMathias ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        String[] opciones = {"Búsqueda Secuencial", "Búsqueda Binaria"};
        opcionesBusqueda = new JComboBox<>(opciones);

        ejecutarButton = new JButton("");
        ejecutarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarAccion();
            }
        });

        setLayout(new FlowLayout());
        add(opcionesBusqueda);
        add(ejecutarButton);
    }

    private void ejecutarAccion() {
        String seleccion = (String) opcionesBusqueda.getSelectedItem();
        if (seleccion.equals("Búsqueda Secuencial")) {
            ventanaPrincipal.busquedaSecuencial();
        } else if (seleccion.equals("Búsqueda Binaria")) {
            ventanaPrincipal.busquedaBinaria();
        }
    }

    public void setButtonText(String text) {
        ejecutarButton.setText(text);
    }

    public JComboBox<String> getOpcionesBusqueda() {
        return opcionesBusqueda;
    }
}