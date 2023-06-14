/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_14;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int t1[] = new int[0];
        int sueldo = 0;
        int contadorSueldos = 0;
        int sTotal=0;
        int media=0;        int max = 0;
        int min = 0;
        System.out.print("Introducir sueldo (introducir -1 para terminar): ");
        sueldo = sc.nextInt();
        max = sueldo;
        min = sueldo;
        while (sueldo != -1) {
            t1 = Arrays.copyOf(t1, t1.length + 1);
            t1[contadorSueldos] = sueldo;
            contadorSueldos = contadorSueldos + 1;
            System.out.print("Introducir otro sueldo: ");            
            sueldo = sc.nextInt();
        }
    System.out.println("Has introducido "+contadorSueldos+" sueldos");
    Arrays.sort(t1);
    System.out.println("Los sueldo ordenados decrecientemente son:");
    for (int j=t1.length-1; j>=0; j--){
        System.out.println("Sueldo "+(j+1)+": "+t1[j]);
        sTotal=sTotal+t1[j];
    }
    media=sTotal/contadorSueldos;
    System.out.println("La media de los sueldos es: "+media);
    System.out.println("minimo es: "+ t1[0]);
    System.out.println("Maximo es"+t1[t1.length-1]);
    }
}