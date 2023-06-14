import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("carta.txt"));
            Scanner s ;
            double sumaCaracteres = 0;
            String linea;
            while(linea = in.readLine()){
                s = new Scanner(linea);
                if (s.hasNext()) {
                    sumaCaracteres = sumaCaracteres + (char) s.next();

                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
