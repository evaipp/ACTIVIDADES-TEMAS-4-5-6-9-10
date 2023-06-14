import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedWriter escritura = null;
        BufferedReader bre = null;
        FileInputStream flujo = null;
        Scanner sc;

        int opcion;
        boolean salir = false;
        do {
            menu();
            System.out.print("\nIntroduce la opcion que deseas: ");
            sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    String contactos[] = new String[0];
                    String texto;
                    System.out.println("1. Agregar Contacto\n");
                    try {
                        contactos = leerFichero(bre, sc);
                        do {
                            sc = new Scanner(System.in);
                            System.out.print("Introduce el nombre del contacto: ");
                            texto = sc.next();
                            System.out.print("Introduce el numero de telefono del contacto: ");
                            texto = texto + "     " + sc.next();
                        } while (existeFirma(contactos, texto));
                        //
                        escritura = new BufferedWriter(new FileWriter("agenda.txt", true));
                        escritura.write(texto);
                        escritura.newLine();
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
                    break;
                case 2:
                        // Guardamos los datos del archivo agenda en un array de tipo String para poder
                        // compararlo con la busqueda
                        contactos = leerFichero(bre, sc);
                        // Pedir dato de busqueda
                        System.out.print("Introduce tu busqueda: ");
                        sc = new Scanner(System.in);
                        String busqueda = sc.next();
                        mostrarContactos(contactos, busqueda);
                    break;
                case 3:
                        contactos =leerFichero(bre, sc);
                        mostrarAgendaAlpha(contactos);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        } while ((opcion < 1 || opcion > 4) || !salir);
    }

    public static void menu() {
        System.out.println("\n------------------------------");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Mostrar todos los contactos");
        System.out.println("4. Salir");
        System.out.println("------------------------------");
    }

    public static boolean existeFirma(String[] contactos, String contactoNuevo) {
        boolean existe = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].equals(contactoNuevo)) {
                existe = true;
            }
        }
        return existe;
    }

    public static void mostrarContactos(String[] contactos, String busqueda) {
        System.out.println();
        for (int i = 0; i < contactos.length; i++) {
            int coincidencias = 0;
            for (int j = 0; j < busqueda.length(); j++) {
                String contacto = contactos[i].toLowerCase();
                if (contacto.charAt(j) == busqueda.toLowerCase().charAt(j)) {
                    coincidencias++;
                    if (coincidencias == busqueda.length()) {
                        System.out.println(contacto);
                    }
                }
            }
        }
    }

    public static void mostrarAgendaAlpha(String[] contactos) {
        Arrays.sort(contactos);
        for (int i = 0; i < contactos.length; i++) {
            System.out.println(contactos[i]);
        }
    }

    public static String[] leerFichero(BufferedReader br, Scanner sc) {
        String[] contactos = new String[0];
        try {
            br = new BufferedReader(new FileReader("agenda.txt"));
            sc = new Scanner(br);
            while (sc.hasNext()) {
                String contacto = sc.nextLine();
                contactos = Arrays.copyOf(contactos, contactos.length + 1);
                contactos[contactos.length - 1] = contacto;
            }
            sc.close();
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
        return contactos;
    }
}