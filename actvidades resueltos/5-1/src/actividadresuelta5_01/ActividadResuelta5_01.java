/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadresuelta5_01;

/**
 *
 * @author Fran
 */
public class ActividadResuelta5_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Crear una tabla de longitud 10 que se iniciará "
                + "con números aleatorios comprandidosentre 1 y 100.\n"
                + "Mostrar la suma de todos los números aleatorios que se "
                + "guardan en la tabla.\n");
        
        int num[] = new int [10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*100 + 1);
        }
        int suma = 0;
        for (int valor : num) {
            suma += valor;
        }
        System.out.println("La suma de los valores aleatorios es = " + suma);
    }
}