import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*9.11- Implementar la clase "Lista" para almacenar elementos de tipo String.
         *9.12- Definir las interfaces "Cola" y "Pila" para objetos "String" e implementarlos en la clase 'Lista' definida en la Actividad 9.11*/
        String palabra;
        boolean comprobacion = false; //boolean para comprobar si deseamos seguir introduciendo o no más palabras.
        Scanner sc = new Scanner(System.in);

        Lista x = new Lista();

        System.out.print("Introduzca una palabra (poner 'salir' para salir ): ");
        palabra = sc.next();

        do{
            x.encolar(palabra);/*x.apila(palabra) //Para apilar en vez de encolar*/
            System.out.print(" Introduzca una palabra: ");
            palabra = sc.next();
            
            if (palabra.contains("salir")){
                comprobacion = true;
            }
        } while (comprobacion == false);

        
        /****** Ejercicio 9.12*****/

        /* Líneas de código para desencolar*/
        palabra = x.desencolar(); /*palabra = x.desapilar() // En caso de usar la cola*/

        while (palabra != null){
            System.out.print(palabra + " ");
            palabra = x.desencolar(); /*palabra = x.desapilar()*/
        }
        System.out.println("");

        sc.close();
    }
}