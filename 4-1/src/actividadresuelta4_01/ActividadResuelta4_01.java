/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_01;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduzca un número: ");
        n = sc.nextInt();
        
        System.out.println("-- Antes de llamar a la función --");
        
        eco(n);
        
        System.out.println("-- Después de llamar a la función --");        
    }
    
    //Funciones.
    
    static void eco (int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Eco...");
        }
        
    }
}