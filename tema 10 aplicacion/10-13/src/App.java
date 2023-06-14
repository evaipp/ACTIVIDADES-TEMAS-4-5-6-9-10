import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream flujo = null;
        int tabla[] = new int[0];
        int tabla2[] = new int[0];
        BufferedWriter escritura = null;
        try {
            flujo = new FileInputStream("Lista1.txt");
            Scanner s = new Scanner(flujo);
            while (s.hasNext()) {
                int n = s.nextInt();
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
                tabla[0] = n;
            }
            flujo = new FileInputStream("Lista2.txt");
            s = new Scanner(flujo);
            while (s.hasNext()) {
                int n = s.nextInt();
                tabla2 = Arrays.copyOf(tabla2, tabla2.length + 1);
                System.arraycopy(tabla2, 0, tabla2, 1, tabla2.length - 1);
                tabla2[0] = n;
            }
            int tablaFinal[] = new int[tabla.length + tabla2.length];
            System.arraycopy(tabla, 0, tablaFinal, 0, tabla.length);
            System.arraycopy(tabla2, 0, tablaFinal, tabla.length, tabla2.length);
            Arrays.sort(tablaFinal);
            escritura = new BufferedWriter(new FileWriter("tercerArchivo.txt"));
            for (int i = 0; i < tablaFinal.length; i++) {
                String numero = String.valueOf(tablaFinal[i]);
                escritura.write(numero);
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
