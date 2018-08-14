/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *Tarea MVNGIT
 * 
 * @author Carlos Andres Castaneda Lozano
 */
public class Linked {
    
    private Nodo cabeza;
    private int tamanio; 
    
    /**
     * Constructor Linked
     */
    
    public Linked(){
        cabeza = null;
        tamanio = 0;
    }
    
    /**
     *
     * @param n 
     */
    
    public void agregar(double n){
        if(cabeza==null){
            cabeza = new Nodo(n);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(n);
            nuevo.agregar(temp);
            cabeza = nuevo;
        }
        tamanio++;
    }
    
    /**
     * 
     */
    
    public double ver(int indice){
        Nodo temp = cabeza;
        for(int i=0;i<indice;i++){
            temp = temp.getNext();
        }
        return temp.getDato();
    }
    
    /**
     * 
     */
    
    public int getTamanio(){
        return tamanio;
    }
    
    /**
     * 
     */
    
    public boolean estaVacia(){
        return (cabeza == null)?true:false;
    }
    
}
