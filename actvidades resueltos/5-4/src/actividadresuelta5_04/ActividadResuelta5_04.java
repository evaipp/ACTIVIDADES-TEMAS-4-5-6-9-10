/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta5_04;
import java.util.*;
/**
 *
 * @author Fran
 */
public class ActividadResuelta5_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Diseñar la función (int maximo(int t[]), que devuelva "
                + "el máximo valor contenido en la tabla t.\n");
        
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        
        System.out.print("¿Cuántos números desea introducir? ");
        int num = sc.nextInt();
        System.out.println("");
        
        double t[] = new double [num];
        
        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduzca un número: ");
            t[i] = sc.nextDouble();
        }
        
        double max = maximo(t);
        System.out.println("\nEl número más alto es = " + max);
    } 
    
    static double maximo(double t[]) {
        double max = t[0];
        
        for (double e : t) {
            if (e > max) {
                max = e;
            }
        }
        return (max);
    }
}