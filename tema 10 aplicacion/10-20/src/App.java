import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del primer archivo: ");
        String path = sc.next() + ".txt";
        System.out.print("Introduce el nombre del segundo archivo: ");
        String path2 = sc.next() + ".txt";
        System.out.println("¿Son archivos iguales?" + comp(path, path2, br, sc));

    }

    public static boolean comp(String path1, String path2, BufferedReader br, Scanner sc) {
        String[] primerArchivo = new String[0], segundoArchivo = new String[0];
        try {
            br = new BufferedReader(new FileReader(path1));
            primerArchivo = obtenArrayTexto(path1, sc, br);
            br = new BufferedReader(new FileReader(path2));
            segundoArchivo = obtenArrayTexto(path2, sc, br);
            if (Arrays.equals(primerArchivo, segundoArchivo)) {
                return true;
            } else {
                for (int i = 0; i < primerArchivo.length; i++) {
                    if (primerArchivo[i] != segundoArchivo[i]) {
                        char[] caracteres1 = new char[primerArchivo[i].length()];
                        char[] caracteres2 = new char[segundoArchivo[i].length()];
                        for (int x = 0; x < primerArchivo[i].length(); x++) {
                            caracteres1[x] = primerArchivo[i].charAt(x);
                        }
                        for (int j = 0; j < segundoArchivo[i].length(); j++) {
                            caracteres2[j] = segundoArchivo[i].charAt(j);
                        }

                        for (int j = 0; j < caracteres1.length; j++) {

                                if (caracteres1[j] != caracteres2[j]) {
                                    System.out.println("En la linea numero: "+ (i+1) + "\n Tiene como error: "+ caracteres1[j]+" ; " +caracteres2[j]+ " error." );
                                }
                        }

                    }
                }
            }
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
        return false;
    }

    public static String[] obtenArrayTexto(String path, Scanner sc, BufferedReader br) {
        String[] textos = new String[0];
        sc = new Scanner(br);
        while (sc.hasNext()) {
            String linea = sc.next();
            textos = Arrays.copyOf(textos, textos.length + 1);
            textos[textos.length - 1] = linea.toLowerCase();
        }
        System.out.println(Arrays.toString(textos));
        return textos;
    }

}
