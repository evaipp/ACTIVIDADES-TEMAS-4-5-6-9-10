/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_13;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class Actividadaplicacion5_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux[] = {1, 2, 5, 3, 2, 5, 4, 3, 4, 1, 2, 5, 1, 3, 2};
      System.out.println(Arrays.toString(aux));
      System.out.println("Escriba un número del 1 al 5:");
      int aBuscar = new Scanner(System.in).nextInt();
      int indices[] = buscarTodos(aux, aBuscar);

      System.out.println("El número " + aBuscar + " se encuentra en los índices");
      System.out.println(Arrays.toString(indices));
   }

   static int[] buscarTodos(int t[], int clave) {
      int encontradoEn[] = new int[0]; 

      for (int i = 0; i < t.length; i++) {
         if (t[i] == clave) {
            encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length + 1);
            encontradoEn[encontradoEn.length - 1] = i;
         }
      }

      return encontradoEn;
    }
} 