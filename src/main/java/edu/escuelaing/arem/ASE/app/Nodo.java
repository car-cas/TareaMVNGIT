
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author Carlos Andres Castaneda Lozano
 */
public class Nodo {
    private Nodo next;
    private Object dato;
    
    public Nodo(Object dato){
        this.dato = dato;
        this.next = null;
    }
    
    public Nodo getNext(){
        return this.next;
    }
    
    public void agregar(Nodo n){
        this.next = n;
    }
    
    public Object getDato(){
        return this.dato;
    }
    
}
