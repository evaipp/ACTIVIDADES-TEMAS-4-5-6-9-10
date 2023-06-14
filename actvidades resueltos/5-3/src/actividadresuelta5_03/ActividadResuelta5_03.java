/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta5_03;
import java.util.*;
/**
 *
 * @author Fran
 */
public class ActividadResuelta5_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Solicitar al usuario cuántos número se quieren introducir. "
                + "Introducir esa cantidad de números\ny que se muestren en orden inverso.\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números desea introducir? ");
        int num = sc.nextInt();
        
        int t[] = new int [num];
        
        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextInt();
        }
        
        System.out.println("\nLos números en orden inverso son: ");
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.print(t[i] + " ");
        }
        System.out.println("");
    }
}