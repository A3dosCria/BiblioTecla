/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Rayni
 */
public class Livro {   
    
    private int id;
    private String titulo;
    private String autor;
    private String tipo;
    private int nota;

    public Livro(int id, String titulo, String autor, String tipo, String genero, int nota) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.nota = nota;
    }

    public Livro() {
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    
    
}
