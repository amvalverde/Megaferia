/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.Editorial;
import core.Gerente;
import core.Megaferia;
import core.Stand;
import java.util.ArrayList;

/**
 *
 * @author amvalverde
 */
public class Main {
    
    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia();
        
        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(150000);
        megaferia.createStand(500000);
        
        Gerente gerente1 = new Gerente("Juan Juliao",104632);
        Gerente gerente2 = new Gerente("Pablo Ramirez", 109746);
        
        Editorial editorial1 = new Editorial("891-87524896-1","Planeta","Calle 45 # 43 - 97", gerente1);
        Editorial editorial2 = new Editorial("890-97895711-6","Penguin Random House","Calle skibidi # 43 - 97", gerente2);
        
        //Listas temporal standsIds
        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);
        
        //Listas temporal editoriales
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);
        
        megaferia.assignStandEditorial(standsIds, editoriales);
        
        System.out.println(megaferia + " -> " + megaferia.getStands());
        System.out.println(megaferia + " -> " + megaferia.getEditoriales() + "\n");
        
        System.out.println(gerente1 + " -> " + gerente1.getEditorial());
        System.out.println(gerente2 + " -> " + gerente2.getEditorial() + "\n");
        
        System.out.println(editorial1 + " -> " + editorial1.getGerente());
        System.out.println(editorial2 + " -> " + editorial2.getGerente() + "\n");
        
        System.out.println(editorial1 + " -> " + editorial1.getStands());
        System.out.println(editorial2 + " -> " + editorial2.getStands() + "\n");
        
        megaferia.verifyStands();
                
        
    }

    
}
