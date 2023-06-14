import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int tabla[] = new int[0];
        try {
            FileInputStream flujo = new FileInputStream("lista1.txt");
            Scanner s = new Scanner(flujo);
            while (s.hasNext()) {
                int n = s.nextInt();
                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
                tabla[0] = n;
            }
            System.out.println(Arrays.toString(tabla));
            int mayor = mayorQ(tabla);
            int menor = menorQ(tabla);
            System.out.println(menor);
            System.out.println(mayor);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int mayorQ(int[] tabla){
        int mayor = 0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        return mayor;
    }
    public static int menorQ(int[] tabla){
        int menor = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] < menor) {
                menor = tabla[i];
            }
        }
        return menor;
    }
}
