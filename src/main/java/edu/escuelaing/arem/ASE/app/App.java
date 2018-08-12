package edu.escuelaing.arem.ASE.app;

/**
 * Tarea MVNGIT
 * @author Carlos Andres Castaneda Lozano
 */


public class App{
   
    private Nodo cabeza;
    private int tamano; 
    private double med;
    private double derivacion;
    
    public App(){
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
    
    public double media(){
        
        return 0;
    }
    
    public double desviacion(){
        
        return 0;
    }
    
    public static void main( String[] args ){
            App app = new App();
            app.agregar(5);
            app.agregar(4);
            app.agregar(5);
            app.agregar(5);
            app.agregar(5);
            app.agregar(5);
            app.agregar(5);
            app.agregar(5);
            
    }
}
