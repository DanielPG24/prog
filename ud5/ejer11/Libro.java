/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer11;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, String isbn, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.isbn == ((Libro)obj).isbn;
    }
}
