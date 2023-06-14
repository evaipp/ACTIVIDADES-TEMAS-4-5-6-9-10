/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta5_05;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class ActividadResuelta5_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Hacer una funcion que cree y devuelva una tabla ordenada "
                + "de una longitud especificada, que se encuentra\nrellena con numeros "
                + "pares aleatorios comprendidos en el rango desde 2 hasta fin.\n");

        Scanner sc = new Scanner(System.in);
        int longitud, fin;

        do {
            System.out.print("Introduce la longitud máxima de la tabla: ");
            longitud = sc.nextInt();
        } while (longitud <= 0);

        do {
            System.out.print("Introduce el número máximo: ");
            fin = sc.nextInt();
        } while (fin <= 1);

        System.out.println("");

        rellenaPares(longitud, fin);
    }

    static int[] rellenaPares(int longitud, int fin) {
        int pares[] = new int[longitud];

        int i = 0;

        while (i < pares.length) {
            int num = (int) (Math.random() * fin + 1);
            if (num % 2 == 0) {
                pares[i] = num;
                i++;
            }
        }
        Arrays.sort(pares);
        System.out.println(Arrays.toString(pares)); /*Para mostrar el Array y no el slot de memoria.*/
        return (pares);
    }
}