/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author amvalverde
 */
public abstract class Libro {
    protected String titulo;
    protected ArrayList<Autor>autores;
    protected String isbn;
    protected String genero;
    protected String formato;
    protected float valor;
    protected Editorial editorial;
    
    public Libro (String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial){
        this.titulo=titulo;
        this.isbn=isbn;
        this.genero=genero;
        this.formato=formato;
        this.valor=valor;
        this.editorial=editorial;
        
        for (Autor autor : this.autores){
            autor.addLibro(this);
        }
        this.editorial.addLibro(this);
        
    }
    
    
}
