package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Tarea MVNGIT
 * 
 * @author Carlos Andres Castaneda Lozano
 */


public class App{
   
    private static double pro;
    private static double deri;
    private static Linked lista = new Linked();
    
    
    /**
     * Constructor App
     */
    
    public App(){
        
        this.lista=lista;
        this.pro=pro;
        this.deri=deri;
    }
    
    /**
     * Metodo media, calcula la media de una lista encadenada
     * @return res media de la lista
     */
    
    public static double media(){
        double res;
        for (int i =0;i<lista.getTamanio();i++){
           pro+=lista.ver(i);
       }
        res =  pro/lista.getTamanio();
        return res;
    }
    
     /**
     * Metodo derivadaParcial, calcula la derivada parcial de una lista encadenada
     * @return total derivada parcial de la lista
     */
    
    
    public static double desviacionEstandar(){
        for (int i =0;i<lista.getTamanio();i++){
           deri+=lista.ver(i); 
        }
   
        double p = deri/lista.getTamanio();
        double c = 0;
        
        for (int i =0;i<lista.getTamanio();i++){
           c+=Math.pow(lista.ver(i)-p,2);
        }
        
        double total = Math.sqrt(c/(lista.getTamanio()-1));

        return total;
    }
    
    /**
     * Metodo leerArchivo, lee los números de un archivo .txt y los almacena en una lista enlazada
     * @throws java.io.IOException IoException
     * @param archivo archivo
     */
 
    public static void leerArchivo(String archivo) throws IOException{
        
        BufferedReader in = new BufferedReader(new FileReader(archivo));
        String listado;
        while ((listado = in.readLine())!=null){
            double  nuevo = Double.parseDouble(listado);
            lista.agregar(nuevo);
        }
        in.close();
    }
    
    /**
     * Metodo main
     * @param args args
     * @throws java.io.IOException exception
     */
    
    public static void main( String[] args ) throws IOException{
        
        String c;
        c = "archivo.txt";
        leerArchivo(c);
        System.out.println("Media : "+ media());
        System.out.println("Desviacion Estandar : "+ desviacionEstandar());
        
    }
    
    
}
