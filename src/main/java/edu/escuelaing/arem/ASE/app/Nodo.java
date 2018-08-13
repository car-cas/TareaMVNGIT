
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 */
public class Nodo {
    private Nodo next;
    private double dato;
    
    public Nodo(double dato){
        this.dato = dato;
        this.next = null;
    }
    
    public Nodo getNext(){
        return this.next;
    }
    
    public void agregar(Nodo n){
        this.next = n;
    }
    
    public double getDato(){
        return this.dato;
    }
    
}
