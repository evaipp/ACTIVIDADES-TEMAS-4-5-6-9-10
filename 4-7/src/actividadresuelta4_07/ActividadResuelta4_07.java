/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_07;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduzca un número: ");
        n = sc.nextInt();

        System.out.println(n + " tiene " + numDivisoresPrimos(n) + " divisores primos.");
    }

    //Funciones.
    static boolean esPrimo(int num) {
        boolean primo = true;
        int i = 2;

        if (num < 1) {
            primo = false;
        }
        while (i < num && primo == true) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }

    static int numDivisoresPrimos(int num) {
        int cont = 1;
        for (int i = 2; i <= num; i++) {
            if (esPrimo(i) && num % i == 0) {
                cont++;
            }
        }
        return (cont);
    }

}