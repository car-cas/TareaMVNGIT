/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 */
public class Linked {
    
    private Nodo cabeza;
    private int tamano; 
    
    public Linked(){
        cabeza = null;
        tamano = 0;
    }
    
    public void agregar(Object n){
        if(cabeza==null){
            cabeza = new Nodo(n);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(n);
            nuevo.agregar(temp);
            cabeza = nuevo;
        }
        tamano++;
    }
    
    public Object ver(int indice){
        Nodo temp = cabeza;
        for(int i=0;i<indice;i++){
            temp = temp.getNext();
        }
        return temp.getDato();
    }
    
}
