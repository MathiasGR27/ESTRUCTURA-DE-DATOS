/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6_gualpamathias;

/**
 *
 * @author ESPE
 */
public class Libros {
    String Titulo;
    String Autor;
    int anioEdicion;

    public Libros(String Titulo, String Autor, int anioEdicion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.anioEdicion = anioEdicion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAniooEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }
    
    
}
