import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /****Valores para socios***/
        Socio[] t = new Socio[] {
            new Socio(2, "Ana", "07-12-1995"),
            new Socio(5, "Jorge", "20-01-2002"),
            new Socio(1, "Juan", "06-05-2004"),
        };

        /*******Mostrar datos******/
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

    }
}