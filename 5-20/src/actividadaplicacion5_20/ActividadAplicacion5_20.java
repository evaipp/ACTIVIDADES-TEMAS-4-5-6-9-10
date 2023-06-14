/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_20;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {10, 12, 14, 20, 22, 24};
        int b[] = {5, 10, 15, 18, 19, 21, 23, 35};
        
        int c[] = fusion(a, b);
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));
    }
    
    static int[] fusion(int t1[], int t2[]) {
        int i1 = 0; 
        int i2 = 0; 
        int iC = 0; 
        
        int c[] = new int[t1.length + t2.length]; 
        while (i1<t1.length && i2<t2.length) {
            if(t1[i1] <= t2[i2]) {
                c[iC] = t1[i1];
                i1++;
            } else {
                c[iC] = t2[i2]; 
                i2++;
            }
            iC++;
        }
           
        if (i1 == t1.length) {
            while(i2<t2.length) {
                c[iC] = t2[i2];
                i2++;
                iC++;
            }
        } else {
            while(i1<t1.length) {
                c[iC] = t1[i1];
                i1++;
                iC++;
            }
        }
        return c;
    }
}