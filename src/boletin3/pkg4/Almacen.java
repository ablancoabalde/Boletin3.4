
package boletin3.pkg4;

public class Almacen {
    private int polbos;
    private int patacas;
    private int clientes;
    public Almacen(){
        
    }
    
    public Almacen(int po, int pa){
        polbos=po;
        patacas=pa;
    }
    
    public void setpolbos(int po){
        polbos=po;
    }
    
    public int getpolbos(){
        return polbos;           
    }
    
    public void setpatacas(int pa){
        patacas=pa;
    }
    
    public int getpatacas(){
        return patacas;           
    }
    
    public void engadirPolbo(int x ){
        polbos +=x;
    }
    public void engadirPatacas ( int x)  {
        patacas +=x;
    }
    public void amosarPolbo( ) {
        System.out.println("Tiene tantos " + polbos + "polbos");
    }
    public void amosarPatacas ( ) {
        System.out.println("Tiene tantos " + patacas + "patacas");
    }
    
    public int calcularPersonas(){
        
        if(polbos*1.5 < patacas*3){
            
           clientes=polbos/2;
           
        }else{
            clientes=patacas;
            
        }                       
        
        return clientes*3;
    }
}
