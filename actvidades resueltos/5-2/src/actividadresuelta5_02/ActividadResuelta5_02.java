/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta5_02;
import java.util.*;
/**
 *
 * @author Fran
 */
public class ActividadResuelta5_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Diseñar un programa que solicite al usuario que "
                + "introduzca 5 números decimales.\nA continuación, "
                + "mostrar los números e el mismo orden que se han introducido.\n");
        
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        double t[] = new double [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: " );
            t[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(t));
    }
}