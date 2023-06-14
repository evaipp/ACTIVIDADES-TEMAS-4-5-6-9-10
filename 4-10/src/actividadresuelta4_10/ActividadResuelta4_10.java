
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_10;

import java.util.*;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Calculo de números con exponente.");

        /*      //Versión iterativa
        int exp;
        double base, result;
        
        do {
            System.out.print("Introduzca base distinta de 0: ");
            base = sc.nextDouble();
        } while (base == 0);
        
        do {
            System.out.print("Introduzca exponente (entero no negativo): ");
            exp = sc.nextInt();
        } while (exp < 0);
        
        result = aElevadoN(base, exp);
        System.out.println(base + " elevado a " + exp + " = " + result); */
        
        
        //Versión recursiva/////////////////////////////////
        int exp;
        double base;

        do {
            System.out.print("Introduzca base distinta de 0: ");
            base = sc.nextDouble();
        } while (base == 0);

        do {
            System.out.print("Introduzca exponente (entero no negativo): ");
            exp = sc.nextInt();
        } while (exp < 0);
        
        System.out.println("El resultado es = " + aElevadoN(base, exp));
    }

    /*  //Versión iterativa
    static double aElevadoN(double a, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return (result);
    } */
    
    
    //Versión recursiva////////////////////////////////////
    static double aElevadoN(double a, int n) {
        double result;
        if (n == 0) {
            result = 1;
        } else {
            result = a * aElevadoN(a, n - 1);
        }
        return (result);
    }
    
}