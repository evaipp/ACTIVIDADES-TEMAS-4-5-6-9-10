/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_15;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      final int NUM_ALUM = 5; 

      int notas[][] = new int[3][NUM_ALUM]; 

      for (int trimestre = 0; trimestre < 3; trimestre++) {
         System.out.println("Notas para el trimeste " + (trimestre + 1));
         leerNotas(notas, trimestre); 
      }

      int suma[] = new int[3]; 

      for (int alumn = 0; alumn < NUM_ALUM; alumn++) { 
         for (int trim = 0; trim < 3; trim++) { 
            suma[trim] += notas[trim][alumn]; 
         }
      }

      System.out.println("Media 1er trimestre: " + (double) suma[0] / NUM_ALUM);
      System.out.println("Media 2º trimestre: " + (double) suma[1] / NUM_ALUM);
      System.out.println("Media 3er trimestre: " + (double) suma[2] / NUM_ALUM);

      System.out.print("Intoduzca posición del alumno: ");
      int pos = sc.nextInt();

      double mediaAlumno = (double) (notas[0][pos] + notas[1][pos] + notas[2][pos]) / 3;
      System.out.println("La media del alumno es: " + mediaAlumno);
   }

   static void leerNotas(int t[][], int trimestre) {
      Scanner sc = new Scanner(System.in);
      for (int i = 0; i < t[trimestre].length; i++) { 
         System.out.print("Alumno (" + i + "): ");
         t[trimestre][i] = sc.nextInt();
      }
   }
}