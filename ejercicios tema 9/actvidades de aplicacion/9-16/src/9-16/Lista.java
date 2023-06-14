/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AF9_16_Object_Pila_Cola;

import java.util.Arrays;

/**
 *
 * @author jlu
 */

public class Lista implements Cola, Pila {
       private Object tabla[];
       Lista(){
           tabla=new Object[0];
       }
       
     public void encolar (Object nuevo){
         insertarFinal(nuevo);
     }
     
      public Object desencolar(){
          return eliminarPrincipio();
      }

       
      public void apilar (Object elemento){
          insertarFinal(elemento);
      }

      public Object desapilar(){
           return eliminarFinal();
      }
       void insertarPrincipio(Object nuevo){
           tabla=Arrays.copyOf(tabla,tabla.length+1);
           System.arraycopy(tabla,0,tabla,1,tabla.length-1);
           tabla[0]=nuevo;
       }
       
       void insertarFinal(Object nuevo){
           tabla=Arrays.copyOf(tabla,tabla.length+1);
           tabla[tabla.length-1]=nuevo;
       }
       
       void insertar(int i, Object nuevo){
           tabla=Arrays.copyOf(tabla,tabla.length+1);
           System.arraycopy(tabla,i,tabla,i+1,tabla.length-i-1);
           tabla[i]=nuevo;
       }
       
       Object eliminarFinal(){
           return tabla=Arrays.copyOf(tabla,tabla.length-1);           
       }

       public Object eliminarPrincipio(){
           Object o;
           System.arraycopy(tabla, 1, tabla, 0, tabla.length-1);
           o=Arrays.copyOf(tabla,tabla.length-1);           
           return o;
      }

       

        void eliminar(int i){
           System.arraycopy(tabla,i+1,tabla,i,tabla.length-i-1);
           tabla=Arrays.copyOf(tabla,tabla.length-1);           
       }

       
       public String toString(){
           return Arrays.toString(tabla);
//         return Arrays.deepToString(tabla);           
       }

       Object get(int i){
           Object result=null;
           if (i>=0 && i<tabla.length)
               result=tabla[i];
           return result;
       }
       
       int buscar(Object o){
           int indice = -1;
           for (int i=0; i<tabla.length && indice==-1; i++){
               if (tabla[i].equals(o)){
                   indice=i;
               }
           }
           return indice;
       }
       
}
