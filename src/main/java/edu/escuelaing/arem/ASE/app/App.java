package edu.escuelaing.arem.ASE.app;

/**
 * Tarea MVNGIT
 * @author Carlos Andres Castaneda Lozano
 */


public class App{
    
    private Linked lista;
    private Linked listaDos;
    
    private double pro;
    private double deri;
    
    public App(){
        this.lista=lista;
        this.pro=pro;
        this.deri=deri;
    }
    
    public double media(){
    
        return pro;
    }
    
    public double derivadaParcial(){
        
        return deri;
    }
    
   
    public static void main( String[] args ){
        App app = new App();
        System.out.println("Media: "+app.media());
        System.out.println("DerivadaParcial: "+app.derivadaParcial());
    }
}
