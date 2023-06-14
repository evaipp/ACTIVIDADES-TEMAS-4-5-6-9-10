/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta5_06;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadResuelta5_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Definir una función que tome como parámetro dos tablas, "
                + "la primera con los 6 números de\nuna apuesta de la primitiva, y "
                + "la segunda (ordenada) con los 6 números de la combinación\nganadora. "
                + "La función devolverá el número de aciertos.\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca su apuesta.");
        int apuesta[] = new int [6];
        
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Introduzca un número: ");
            apuesta[i] = sc.nextInt();
        }
        
        System.out.println("\nIntroduzca la combinación ganadora.");
        int[] combGanadora = new int [6];
        
        for (int i = 0; i < combGanadora.length; i++) {
            System.out.print("Introduzca un número: ");
            combGanadora[i] = sc.nextInt();
        }
        Arrays.sort(combGanadora); /*ordena el array para la búsqueda de después.*/
        System.out.println("\nNúmero de aciertos: " + primitiva(apuesta, combGanadora));
        
    }
    
    static int primitiva(int apuesta[], int combGanadora[]) {
        int aciertos = 0;
        
        for (int i : apuesta) {
            if (Arrays.binarySearch(combGanadora, i) >= 0) {
                aciertos++;
            }
        }
        return (aciertos);
    }
}