package edu.escuelaing.arem.ASE.app;

/**
 * Tarea MVNGIT
 * @author Carlos Andres Castaneda Lozano
 */


public class App{
    
    private Linked listaDos;
    
    private double pro;
    private double deri;
    private Linked lista = new Linked();
    
    public App(){
        this.lista=lista;
        this.pro=pro;
        this.deri=deri;
    }
    
    public double media(){
        for (int i =0;i<lista.getTamanio();i++){
           pro+=lista.ver(i);
           
       }
        return pro/lista.getTamanio();
    }
    
    public double derivadaParcial(){
        for (int i =0;i<lista.getTamanio();i++){
           deri+=lista.ver(i); 
        }
        
        double c = 0;
        for (int i =0;i<lista.getTamanio();i++){
           c+=Math.pow(lista.ver(i)-deri,2);
        }
        
        double total = Math.sqrt(c/lista.getTamanio());
        return total;
    }
    
   
    public static void main( String[] args ){
        
    
    }
}
