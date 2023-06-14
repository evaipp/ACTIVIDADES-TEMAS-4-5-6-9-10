import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        BufferedWriter out = null;
        char abecedario[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char abecedarioCodificado[] = new char[0];
        char codificado[] ;
        String texto = "";
        try {
            // PARTE DEL CODIGO QUE LEE LOS CARACTERES DE LA CODIFICACION EN FUNCION DEL ARCHIVO "CODEC.TXT"
            br = new BufferedReader(new FileReader("codec.txt"));
            Scanner sc = new Scanner(br);
            while(sc.hasNext()){
                String linea = sc.next();
                abecedarioCodificado = Arrays.copyOf(abecedarioCodificado, abecedarioCodificado.length + 1);
                abecedarioCodificado[abecedarioCodificado.length - 1]= linea.charAt(0);
            }
            System.out.println(Arrays.toString(abecedario));
            System.out.println(Arrays.toString(abecedarioCodificado));
            
            // PARTE DEL CODIGO DONDE VAMOS A REALIZAR LA LECTURA DEL ARCHIVO DE TEXTO "TEXTOACODIFICAR.TXT"
            // PROCEDIENDO A CODIFICARLO PARA POSTERIORMENTE ESCRIBIRLO EN UN NUEVO ARCHIVO TXT
            br = new BufferedReader(new FileReader("textoACodificar.txt"));
            out = new BufferedWriter(new FileWriter("textoCodificado.txt"));
            sc = new Scanner(br);
            while (sc.hasNext()) {
                String linea = sc.next().toLowerCase();
                codificado = new char[linea.length()];
                for (int i = 0; i < linea.length(); i++) {
                    codificado[i] = codificar(abecedario, abecedarioCodificado, linea.charAt(i));
                }
                texto = texto + " " + String.valueOf(codificado);
                System.out.println(texto);
            }
            out.write(texto);
            
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
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static char codificar(char conjunto1[], char conjunto2[], char c){
        final String conj1 = String.valueOf(conjunto1);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }

}
