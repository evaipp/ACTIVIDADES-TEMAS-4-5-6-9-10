import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedWriter escritura = null;
        Scanner sc = new Scanner(System.in);
        try {
            escritura = new BufferedWriter(new FileWriter("datos.txt", true));
            String linea = pedirDatos(sc);
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
    }

    public static String pedirDatos(Scanner sc) {
        System.out.print("Introduce tu nombre: ");
        String linea = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        linea = linea + " " + sc.nextLine();
        return linea;
    }

}
