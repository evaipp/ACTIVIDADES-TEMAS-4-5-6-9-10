import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[0];
        Integer num;
        try {
            System.out.print("Introduce el nombre del archivo: ");
            String path = sc.next() + ".txt";
            numeros = leerEnteros(path);
            System.out.println(Arrays.toString(numeros));
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static Integer[] leerEnteros(String texto) {
        BufferedReader br = null;
        Integer[] numeros = new Integer[0];
        try {
            br = new BufferedReader(new FileReader(texto.toLowerCase()));
            Scanner sc = new Scanner(br);
            while (sc.hasNext()) {
                String linea = sc.next();
                for (int i = 0; i < linea.length(); i++) {
                    if (Character.isDigit(linea.charAt(i))) {
                        int num = Integer.parseInt(linea);
                        numeros = Arrays.copyOf(numeros, numeros.length + 1);
                        numeros[numeros.length - 1] = num;
                        break;
                    }
                }
            }
            return numeros;
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
        return numeros;
    }

}
