/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_09;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = maximo(2, 9, 7);
        System.out.println("El mayor es: " + max);
    }
    
    //Funciones.
    
    static int maximo(int a, int b, int c) {
        int aux = maximo(a, b);
        return (maximo(aux, c));
    }
    
    static int maximo (int a, int b) {
        int max;
        
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return (max);
    }
}