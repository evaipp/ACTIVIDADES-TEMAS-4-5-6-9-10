/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_12;
import java.util.Scanner;
/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular fibonacci(n)");
        
        System.out.print("Introduzca n (se recomienda n < 40): ");
        int num = sc.nextInt();
        
        int result = fibo(num);
        System.out.println("\nfibonacci(" + num + ") = " + result);
    }
    static int fibo(int num) {
        int result;
        if (num == 0 || num == 1) {
            result = 1;
        } else {
            result = fibo(num - 1) + fibo(num - 2);
        }
        return (result);
    }
}