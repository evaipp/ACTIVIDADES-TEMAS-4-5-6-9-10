/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_17;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t[] = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;
        int aux[] = suma(t, numElementos);
        System.out.println("La sumas de " + Arrays.toString(t));
        System.out.println("Agrupando " + numElementos + " elementos");
        System.out.println(Arrays.toString(aux));
    }
    
    static int[] suma(int t[], int numElementos) {
        int sumas[] = new int[t.length - numElementos + 1];
        
        for (int i = 0; i < sumas.length; i++) {
            sumas[i] = 0;
            for (int j = 0; j < numElementos; j++) {
                sumas[i] += t[i+j];
            }
        }
        
        return sumas;
    }
}