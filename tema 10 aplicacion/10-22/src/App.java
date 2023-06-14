import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        BufferedWriter escritura = null;
        BufferedReader bre = null;
        FileInputStream flujo = null;
        Scanner sc = new Scanner(System.in);
        String[] deportistas = new String[0];
        boolean salir = false;
        int opcion;
        do {
            menu();
            System.out.print("Indique la opcion que desea realizar: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    String linea = "";
                    sc = new Scanner(System.in);
                    System.out.print("Introduce el nombre del deportista: ");
                    linea = sc.nextLine();
                    System.out.print("Introduce la edad del deportista: ");
                    linea = linea + "      " + sc.nextLine();
                    System.out.print("Introduce el peso del deportista: ");
                    linea = linea + "      " + sc.nextLine();
                    System.out.print("Introduce la altura del deportista: ");
                    linea = linea + "      " + sc.nextLine();
                    try {
                        escritura = new BufferedWriter(new FileWriter("deportistas.txt", true));
                        escritura.newLine();
                        escritura.write(linea);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        if (escritura != null) {
                            try {
                                escritura.close();
                            } catch (IOException e) {
                                System.out.println(e);
                            }
                        }
                    }
                    break;
                case 2:
                    deportistas = leerFichero(bre, sc);
                    mostrarMedias(deportistas);
                    break;
                case 3:
                    deportistas = leerFichero(bre, sc);
                    crearFichero(deportistas, escritura, 3, "nombreAltura.txt");
                    crearFichero(deportistas, escritura, 1, "nombreEdad.txt");
                    crearFichero(deportistas, escritura, 2, "nombrePesos.txt");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    break;
            }
        } while ((opcion < 1 || opcion > 4) || !salir);
    }

    public static void menu() {
        System.out.println("\n------------------------------");
        System.out.println("1. Agregar Deportista");
        System.out.println("2. Mostrar medias Deportistas");
        System.out.println("3. Guardar archivos independientes");
        System.out.println("4. Salir");
        System.out.println("------------------------------");
    }

    public static String[] leerFichero(BufferedReader br, Scanner sc) {
        String[] deportistas = new String[0];
        try {
            br = new BufferedReader(new FileReader("deportistas.txt"));
            sc = new Scanner(br);
            sc.nextLine();
            while (sc.hasNext()) {
                String contacto = sc.nextLine();
                deportistas = Arrays.copyOf(deportistas, deportistas.length + 1);
                deportistas[deportistas.length - 1] = contacto;
            }
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        return deportistas;
    }

    public static void mostrarMedias(String[] deportistas) {
        int contadorDeportistas = 0;
        double sumaEdades = 0, sumaPeso = 0, sumaAltura = 0;
        for (int i = 0; i < deportistas.length; i++) {
            int posicionEdad = 1;
            String[] datosDeportista = deportistas[i].split("      ");
            System.out.println(Arrays.toString(datosDeportista));
            sumaEdades += Double.parseDouble(datosDeportista[1]);
            sumaAltura += Double.parseDouble(datosDeportista[3]);
            sumaPeso += Double.parseDouble(datosDeportista[2]);
            contadorDeportistas++;
        }
        System.out.println("Media de altura de los deportistas: " + (sumaAltura / contadorDeportistas));
        System.out.println("Media de peso de los deportistas: " + (sumaPeso / contadorDeportistas));
        System.out.println("Media de edad de los deportistas: " + (sumaEdades / contadorDeportistas));
    }

    public static void crearFichero(String[] deportistas, BufferedWriter escritura, int elemento, String nombreArchivo){
        
        try {
            escritura = new BufferedWriter(new FileWriter(nombreArchivo));
            for (int i = 0; i < deportistas.length; i++) {
                String[] datosDeportistas = deportistas[i].split("      ");
                escritura.write(datosDeportistas[0] + "      ");
                escritura.write(datosDeportistas[elemento]);
                escritura.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

}