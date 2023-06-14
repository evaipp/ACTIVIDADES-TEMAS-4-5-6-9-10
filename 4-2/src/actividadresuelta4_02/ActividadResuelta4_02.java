/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_02;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Introduzca primer número: ");
        a = sc.nextInt();
        
        System.out.print("Introduzca segundo número: ");
        b = sc.nextInt();
        
        mostrar(a, b);
    }
    
    //Funciones.
    
    static void mostrar(int a, int b) {
        int mayor = a > b ? a : b;
        int menor = a < b ? a : b;
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
        
    }
}