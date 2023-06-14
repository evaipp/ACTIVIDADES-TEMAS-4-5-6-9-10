import java.util.Arrays;

/*9.13

Diseñar la clase Futbolista con los siguientes atributos: dni, nombre,edad y numero de goles.
Implementar:
-Un constructor y los metodos toString() y equals() (este ultimo basado en el DNI)
-La interfaz Comparable con un criterio de ordenacion basado tambien en el DNI
-Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad
Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI,por nombre y por edad  */

public class Main {
    public static void main(String[] args) {
        // Creamos un arreglo con 5 futbolistas
        Futbolista[] futbolistas = new Futbolista[5];
        futbolistas[0] = new Futbolista("2345678A", "Juan", 25, 10);
        futbolistas[1] = new Futbolista("13456789B", "Pedro", 22, 5);
        futbolistas[2] = new Futbolista("34567890C", "Luis", 30, 15);
        futbolistas[3] = new Futbolista("45678901D", "Manuel", 28, 8);
        futbolistas[4] = new Futbolista("56789012E", "Carlos", 24, 12);

        // Ordenar por DNI
        Arrays.sort(futbolistas);
        System.out.println("Ordenado por DNI:");
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

     /*    Arrays.sort(futbolistas, new ComparaNombre() {
            public int compare(Futbolista a, Futbolista b) {
            return ((Futbolista) a).getNombre - ((Futbolista) b).getNombre;
            }
        });
        */
        
          // Ordenar por nombre
          Arrays.sort(futbolistas, new comparadorNombre());
          System.out.println("\nOrdenado por nombre:");
          for (Futbolista f : futbolistas) {
          System.out.println(f);
       
          }
       //   System.out.println("\nListado con deepToString\n"+Arrays.deepToString(futbolistas)+"\n");
          
        
         
         // Ordenar por edad
          Arrays.sort(futbolistas, new comparadorEdad());
         System.out.println("\nOrdenado por edad:");
         for (Futbolista f : futbolistas) {
         System.out.println(f);
          }
 }
}
