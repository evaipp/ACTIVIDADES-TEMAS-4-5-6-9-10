import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter escritura = null;
        FileInputStream flujo = null;
        Scanner sc = new Scanner(System.in);
        String[] numeros = new String[0];
        String numero;
        try {

            BufferedReader br = new BufferedReader(new FileReader("agendar.txt"));
            sc = new Scanner(br);
            while (sc.hasNext()) {
                String firmados = sc.nextLine();
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = firmados.toLowerCase();
            }
            System.out.println(Arrays.toString(numeros));
            // ESCRIBE LOS DATOS CORRESPONDIENTES

            // COMPROBAMOS SI LOS DATOS YA CORRESPONDEN AL LIBRO

            System.out.println(existeFirma(numeros, "ivan"));
            do {
                escritura = new BufferedWriter(new FileWriter("agenda.txt", true));
                sc = new Scanner(System.in);
                numero = pedirDatos(sc);
                escritura.write(numero);
                escritura.newLine();
                if (existeFirma(numeros, numero.toLowerCase())) {
                    System.out.println("Esa firma ya se encuentra en el libro, introduce una válida.");
                }
            } while (existeFirma(numeros, numero.toLowerCase()));

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

    public static boolean existeFirma(String[] numeros, String numeroNuevo) {
        boolean existe = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i].equals(numeroNuevo)) {
                existe = true;
            }
        }
        return existe;
    }

    public static String pedirDatos(Scanner sc) {
        System.out.print("Introduce el nombre de tu firma: ");
        String numero = sc.nextLine();
        return numero;
    }
}
