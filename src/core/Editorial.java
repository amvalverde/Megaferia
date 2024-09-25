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
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<Libro>libros;
    private ArrayList<Stand>stands;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = new ArrayList<>(); //Crear Lista vacia
        this.stands = new ArrayList<>(); //Crear Lista vacia
        
        this.gerente.setEditorial(this); //Se le añade esta editorial a su gerente
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.nit + ", " + this.nombre + ")";
    }

    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }
    
    
    
    
    public boolean addLibro(Libro libro){
        
       if (!this.libros.contains(libro)){
           this.libros.add(libro);
           return true;
       }
       return false;
    }
    
    public boolean addStand(Stand stand){
        
       if (!this.stands.contains(stand)){
           this.stands.add(stand);
           return true;
       }
       return false;
    }
    
}
