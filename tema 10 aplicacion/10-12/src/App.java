import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String saludo = "Hola";

        try {
            File archivo = new File("C:/Users/JAVA/Desktop/Tema10/ActividadAplicacion10_12/texto.txt");
            FileWriter writer = new FileWriter(archivo, true);

            for (int i = 0; i < 10; i++) {
                writer.write("Alineados");
                writer.write("\r\n");
            }

            writer.write(saludo);

        } catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }
}