/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta4_08;
import java.util.*;

/**
 *
 * @author JAVA
 */
public class ActividadResuelta4_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int operacion, repetir;
        double n1, n2, resultado;

        System.out.println("-- Calculadora --\n");

        /*  for (operacion = 1; operacion <= 4; operacion++) {
            resultado = calculadora(3.0, 4.0, operacion);
            
            System.out.println(resultado);
        } */
        do {
            System.out.print("Introduzca primer valor: ");
            n1 = sc.nextDouble();

            System.out.print("Introduzca segundo valor: ");
            n2 = sc.nextDouble();

            System.out.print("¿Qué desea realizar? (1/ Suma, 2/ Resta, 3/ Multiplicación, 4/ División) ");
            operacion = sc.nextInt();

            resultado = calculadora(n1, n2, operacion);
            System.out.println(resultado);

            System.out.print("¿Desea realizar otro cálculo? (1/ Sí, 2/ No) ");
            repetir = sc.nextInt();
            System.out.println("");

        } while (repetir == 1);

    }

    //Funciones.
    static double calculadora(double a, double b, int operacion) {

        double result;

        result = switch (operacion) {
            case 1 ->
                a + b;
            case 2 ->
                a - b;
            case 3 ->
                a * b;
            case 4 ->
                (double) a / b;
            default -> {
                System.out.println("Operación no válida.");
                yield 0;
            }
        };
        return (result);
    }

}