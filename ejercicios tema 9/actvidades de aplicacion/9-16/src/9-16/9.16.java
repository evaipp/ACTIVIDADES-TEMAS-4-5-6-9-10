/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AF9_16_Object_Pila_Cola;

import java.util.Arrays;

/**
 *
 * @author jlu
 */
public class AF9_16_Object_Pila_Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Lista l1 = new Lista();
 
    l1.insertarPrincipio("cabra");
    System.out.println(l1);
    l1.insertarPrincipio(1);
    System.out.println(l1);
    l1.insertarPrincipio("c");
    System.out.println(l1);
    l1.insertar(2, 'd');
    System.out.println(l1);
    int i=l1.buscar("cabra");
    System.out.println("El objeto esta en: "+i);
    System.out.println(l1);
    l1.eliminar(2);
    System.out.println(l1);
    l1.eliminarPrincipio();
    System.out.println(l1);
    l1.eliminarFinal();
    System.out.println(l1);

    }
    
}
