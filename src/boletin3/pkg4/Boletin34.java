
package boletin3.pkg4;

import java.util.Scanner;

public class Boletin34 {

    public static void main(String[] args) {
         Almacen almacen1 = new Almacen();
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Cantidad de polbo?");
        almacen1.setpolbos(entrada.nextInt());
        System.out.println("Cantidad de patacas?");
        almacen1.setpatacas(entrada.nextInt());
        
        almacen1.amosarPolbo();
        almacen1.amosarPatacas();
        System.out.println(almacen1.calcularPersonas() + " personas");
    }
    
}
