/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Megaferia {
    
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;
    
    public Megaferia(){
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + ')';
    }

    
    
    public ArrayList<Stand> getStands() {
        return stands;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }
    
    
    
    public void createStand(float precio){
        this.stands.add(new Stand(precio));
    }
    
    public void verifyStands(){
        for (Stand stand : this.stands){
            System.out.println(stand + " -> " + stand.getEditoriales());
        }
    }
    
    public boolean addEditorial(Editorial editorial){
        if(!this.editoriales.contains(editorial)){
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }
    
    public void assignStandEditorial(ArrayList<Integer> standsIds, ArrayList<Editorial> editoriales){
        for(Editorial editorial : editoriales){
            this.addEditorial(editorial);
            for(Integer standId : standsIds){
                Stand stand = this.getStandById(standId);
                if (stand != null){
                    editorial.addStand(stand);
                    stand.addEditorial(editorial);
                }
            }
        }
    }
    
    //Verificar si el stand existe
    private Stand getStandById(int standId){
        for(Stand stand : this.stands){
            if(stand.getId() == standId){
                return stand;
            }
        }
        return null;
    }
    
}
