/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_18b;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_18b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Escribe un programa que solicite los elementos de "
                + "una matriz de tamaño 4x4. La aplicación\ndebe decidir si la "
                + "matriz introducida corresponde a una matriz mágica, que es "
                + "aquella\ndonde la suma de los elementos de cualquier fila o "
                + "de cualquier columna valen lo mismo.\n");
        
        Scanner sc = new Scanner(System.in);
        int matriz [][] = new int [4][4];
        
        /*Introducir datos en matriz*/
        for (int i = 0; i < 4; i++) { /*Eje X*/
            for (int j = 0; j < 4; j++) { /*Eje Y*/
                System.out.print("Dato para la celda del eje X = " + i + " y "
                        + "del eje Y = " + j + " : ");
                matriz [i][j] = sc.nextInt();
            }
        }
        for (int fila [] : matriz) {
            System.out.println("");
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
        }
        System.out.println("");
        
        
        /*Suma y comparación de filas.*/
        int numX0,numX1,numX2,numX3;
        boolean numXTotal = false;
        
        /*Suma celdas fila X=0*/
        numX0 = matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3];
        
        /*Suma celdas fila X=1*/
        numX1 = matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3];
        
        /*Suma celdas fila X=2*/
        numX2 = matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3];
        
        /*Suma celdas fila X=3*/
        numX3 = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3];
        
        /*Comparación*/
        if(numX0 == numX1 && numX1 == numX2 && numX2 == numX3) {
            numXTotal = true;
        }
        
        
        /*Suma y comparación columnas.*/
        int numY0, numY1, numY2, numY3;
        boolean numYTotal = false;
        
        /*Suma celdas columna Y=0*/
        numY0 = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0];
        
        /*Suma celdas columna Y=1*/
        numY1 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1];
        
        /*Suma celdas columna Y=2*/
        numY2 = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2];
        
        /*Suma celdas columna Y=3*/
        numY3 = matriz[0][3] + matriz[1][3] + matriz[2][3] + matriz[3][3];
        
        /*Comparación*/
        if(numY0 == numY1 && numY1 == numY2 && numY2 == numY3) {
            numYTotal = true;
        }
        
        
        /*Suma y comparación de diagonales*/
        int numDiagonal0, numDiagonal1;
        boolean numDiagonalTotal = false;
        
        numDiagonal0 = matriz[0][0] + matriz [1][1] + matriz[2][2] + matriz [3][3];
        numDiagonal1 = matriz[0][3] + matriz [1][2] + matriz[2][1] + matriz [3][0];
        
        /*Comparación*/
        if(numDiagonal0 == numDiagonal1){
            numDiagonalTotal = true;
        }
        
        
        /*Matriz mágica*/
        boolean matrizMagica = false;
        if(numXTotal == true && numYTotal == true && numDiagonalTotal == true) {
            matrizMagica = true;
        }
        
        System.out.println("\n¿La matriz es una matriz mágica? " + matrizMagica);
    }
}