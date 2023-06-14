import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

    Socio t[] =new Socio[5];
    t[0]=new Socio(1,"Basilio", "13-12-2002");
    t[1]=new Socio(2,"Ana", "11-12-2020");
    t[2]=new Socio(3,"Desirée", "12-12-2002");
    t[3]=new Socio(4,"Carmen", "12-12-1992");
    t[4]=new Socio(5,"Ernesto", "12-12-2020");

    System.out.println(Arrays.deepToString(t));

    Arrays.sort(t);
    
    System.out.println(Arrays.deepToString(t));
    }
}