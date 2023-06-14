/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_04;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Introduzca un número: ");
        a = sc.nextInt();
        
        System.out.print("Introduzca otro número: ");
        b = sc.nextInt();
        
        System.out.println("El número mayor es: " + maximo(a,b));
        
    }
    
    //Funciones.
    
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