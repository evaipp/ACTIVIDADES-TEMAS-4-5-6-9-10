/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_11;
import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Máximo común divisor de dos números.");
        Scanner sc = new Scanner(System.in);
        int n1, n2, result;

        do {
            System.out.print("Introduzca el primer número: ");
            n1 = sc.nextInt();
        } while (n1 < 0);

        do {
            System.out.print("Introduzca el segundo número: ");
            n2 = sc.nextInt();
        } while (n2 < 0);

        result = mcd(n1, n2);
        System.out.println("El mcd es " + result);
    }

    static int mcd(int n1, int n2) {
        int result;
        if (n1 == 0) {
            result = n2;
        } else if (n2 == 0) {
            result = n1;
        } else {
            int min = n1 <= n2 ? n1 : n2;
            int max = n1 <= n2 ? n2 : n1;
            result = mcd(min, max - min);
        }
        return (result);
    }

}