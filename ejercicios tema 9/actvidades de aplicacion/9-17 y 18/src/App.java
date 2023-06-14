public class App {
    public static void main(String[] args) throws Exception {   
        
        /*****Cola*****/
         
        Cola c = new Lista();
        Object n;

        System.out.println("");
        for (int i = 0; i < 10; i++) {
            n = (int) (Math.random() * 10);
            c.encolar(n);
            System.out.println("encolando: " + n);
        }

        c.encolar("Hola");

        n = c.desencolar();
        while (n != null) {
            System.out.println("desencolado: " + n);
            n = c.desencolar();
        }

        /*****Pila*****/
 
        Pila x = new Lista();
        Object m;

        System.out.println("");
        for (int i = 0; i < 10; i++) {
            m = (int) (Math.random() * 10);
            x.apilar(m);
            System.out.println("apilando: " + m);
        }

        x.apilar("Hola");

        m = x.desapilar();
        while (m != null) {
            System.out.println("desapilado: " + m);
            m = x.desapilar();
        }
    }
}