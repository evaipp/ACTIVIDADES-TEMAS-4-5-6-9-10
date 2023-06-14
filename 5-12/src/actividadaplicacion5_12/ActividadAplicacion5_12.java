/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_12;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Incializamos automaticamente un array ordenado");
        int t1[] = {1, 3, 4, 5, 7, 8, 9};
        System.out.println("Mostramos el array ordenado");
        System.out.println(Arrays.toString(t1));
        desordenar(t1);
        System.out.println("Mostramos el array desordenado");
        System.out.println(Arrays.toString(t1));

    }
    
    static void desordenar(int t1[]) {
        for (int i = 0; i < t1.length; i++) {
            int n1 = (int) (Math.random() * t1.length - 1);
            int temp = t1[i];
            t1[i] = t1[n1];
            t1[n1] = temp;
        }
    }
}