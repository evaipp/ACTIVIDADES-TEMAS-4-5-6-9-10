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
        String[] temperaturas = new String[0];
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
                    System.out.print("Introduce la fecha del registro(yyyy-mm-dd): ");
                    linea = sc.nextLine();
                    System.out.print("Introduce la temperatura maxima: ");
                    linea = linea + "      " + sc.nextLine();
                    System.out.print("Introduce la temperatura minima: ");
                    linea = linea + "      " + sc.nextLine();
                    try {
                        escritura = new BufferedWriter(new FileWriter("temperaturas.txt", true));
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
                    temperaturas = leerFichero(bre, sc);
                    mostrarMedias(temperaturas);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        } while ((opcion < 1 || opcion > 3) || !salir);
    }

    public static void menu() {
        System.out.println("\n------------------------------");
        System.out.println("1. Registrar temperatura");
        System.out.println("2. Mostrar historial de registros");
        System.out.println("3. Salir");
        System.out.println("------------------------------");
    }

    public static String[] leerFichero(BufferedReader br, Scanner sc) {
        String[] temperaturas = new String[0];
        try {
            br = new BufferedReader(new FileReader("temperaturas.txt"));
            sc = new Scanner(br);
            sc.nextLine();
            while (sc.hasNext()) {
                String medidas = sc.nextLine();
                temperaturas = Arrays.copyOf(temperaturas, temperaturas.length + 1);
                temperaturas[temperaturas.length - 1] = medidas;
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
        return temperaturas;
    }

    public static void mostrarMedias(String[] temperaturas) {
        int contadorDias = 0;
        double sumaMaximas = 0, sumaMinimas = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            String[] datosDeportista = temperaturas[i].split("      ");
            System.out.println(Arrays.toString(datosDeportista));
            sumaMaximas += Double.parseDouble(datosDeportista[1]);
            sumaMinimas += Double.parseDouble(datosDeportista[2]);
            contadorDias++;
        }
        System.out.println("Media de temperaturas minimas : " + (sumaMinimas / contadorDias));
        System.out.println("Media de temperaturas maximas : " + (sumaMaximas / contadorDias));
    }

}