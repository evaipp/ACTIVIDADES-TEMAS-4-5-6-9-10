import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader lectura = null;
        String texto = "", respuesta;
        Scanner sc = new Scanner(System.in);
        try {
            lectura = new BufferedReader(new FileReader("prueba.txt"));
            do {
                String linea = lectura.readLine();
                for (int i = 0; i < 24; i++) {
                    texto = texto + linea + '\n';
                    linea = lectura.readLine();
                }
                System.out.println(texto);
                System.out.print("Introduce comando para continuar: ");
                respuesta = sc.nextLine();
            } while (respuesta.toLowerCase().equals("more"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (lectura != null) {
                try {
                    lectura.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}
