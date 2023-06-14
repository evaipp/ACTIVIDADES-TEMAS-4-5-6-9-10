/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_06;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n");
        
        for (int i = 1; i <= 15; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es primo.");
            } else {
                System.out.println(i + " es compuesto.");
            }
        }
    }
    
    //Funciones.
    
    static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;
        
        if (num < 1) {
            primo = false;
        }
        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }
    
}