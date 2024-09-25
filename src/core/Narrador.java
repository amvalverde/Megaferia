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
public class Narrador extends Persona{
    
    private ArrayList<AudioLibro>libros;    
    
    public Narrador(String nombre, int cedula){
        super(nombre, cedula);
    }
    
    public boolean addLibro(AudioLibro libro){
       if (!this.libros.contains(libro)){
           this.libros.add(libro);
           return true;
       }
       return false;
    }
    
    
}
