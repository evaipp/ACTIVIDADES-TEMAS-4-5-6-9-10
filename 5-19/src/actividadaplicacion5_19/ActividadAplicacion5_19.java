/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadaplicacion5_19;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadAplicacion5_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" ---- GESTION DE CARRERAS ----");
        int t[] = llegadaCorredores();
        mostrarClasificacion(t);
        System.out.println("\nNorma 1ª, los participantes menores de edad "
                + "avanzan una posicion.\n");
        t = menoresEdad(t);
        mostrarClasificacion(t);
        System.out.println("\nNorma 2ª los participantes que den positivo en "
                + "el test de dopaje, quedaran EXPLUSADOS.\n");
        t = dopados(t);
        mostrarClasificacion(t);
        System.out.println("\nNorma 3ª, los participantes que no hayan pagado "
                + "su inscripcion, serán ubicados al final de la clasificación.\n");
        t = sinInscripcion(t);
        System.out.println("\n --- FINAL DE LAS MODIFICACIONES --- ");
        mostrarGanadores(t);
        mostrarClasificacion(t);

        System.out.println(Arrays.toString(t));
    }

    public static void mostrarClasificacion(int t[]) {
        System.out.println("\n\nCLASIFICACION GENERAL: " + Arrays.toString(t) + "\n");
    }

    public static int[] llegadaCorredores() {
        int copiaT[] = new int[0];
        Scanner sc = new Scanner(System.in);
        int dorsal;
        do {
            System.out.print("Introduce el dorsal del participante: ");
            dorsal = sc.nextInt();
            if (dorsal != -1) {
                copiaT = Arrays.copyOf(copiaT, copiaT.length + 1);
                copiaT[copiaT.length - 1] = dorsal;
                System.out.println("Dorsal: " + dorsal + ", Posicion: " + (copiaT.length - 1));
            }
        } while (dorsal != -1);
        return copiaT;
    }

    public static void mostrarGanadores(int t[]) {
        for (int i = 0; i <= 3; i++) {
            switch (i) {
                case 0 ->
                    System.out.println("Medalla de ORO, DORSAL NUMERO: [" + t[i] + "]");
                case 1 ->
                    System.out.println("Medalla de PLATA, DORSAL NUMERO: [" + t[i] + "]");
                case 3 ->
                    System.out.println("Medalla de BRONCE, DORSAL NUMERO: [" + t[i] + "]");
            }
        }
    }

    public static int[] dopados(int t[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("      ---- PROTOCOLO ANTIDOPAJE ----\n");
        System.out.println("(introduce -1 para parar de introducir dorsales)\n");
        int dorsal;
        do {
            System.out.print("Introduce el dorsal del participante dopado: ");
            dorsal = sc.nextInt();
            int indiceBusqueda = 0;
            while (indiceBusqueda < t.length && t[indiceBusqueda] != dorsal) {
                indiceBusqueda++;
            }
            if (indiceBusqueda == t.length) {
                System.out.println("Ese dorsal no se encuentra en la carrera.");
            } else {
                t = Arrays.copyOf(t, t.length + 1);
                System.out.println("Dorsal numero: [" + t[indiceBusqueda] + "] "
                        + "eliminado de la carrera.");
                for (int i = indiceBusqueda; i < t.length - 1; i++) {
                    t[i] = t[i + 1];
                }
                t = Arrays.copyOf(t, t.length - 2);
            }
        } while (dorsal != -1);
        return t;
    }

    public static int[] sinInscripcion(int t[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- PARTICIPANTES SIN PAGO DE INSCRIPCION ----");
        System.out.println("(introduce -1 para parar de introducir dorsales)");
        int dorsal;
        do {
            System.out.print("Introduce el dorsal de los participantes sin "
                    + "inscripcion: ");
            dorsal = sc.nextInt();
            int indiceBusqueda = 0, aux;
            while (indiceBusqueda < t.length && t[indiceBusqueda] != dorsal) {
                indiceBusqueda++;
            }
            if (indiceBusqueda == t.length) {
                System.out.println("Ese dorsal no se encuentra en la carrera.");
            } else {
                aux = t[indiceBusqueda];
                for (int i = indiceBusqueda; i < t.length - 1; i++) {
                    t[i] = t[i + 1];
                }
                t[t.length - 1] = aux;
                System.out.println("Dorsal numero: [" + aux + "], introducido "
                        + "al final.");
            }
        } while (dorsal != -1);
        return t;
    }

    public static int[] menoresEdad(int t[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- MENORES DE EDAD DE LA CARRERA ---");
        System.out.print("(introduce -1 para parar de introducir dorsales)\n\n");
        int dorsal, aux;
        do {
            System.out.print("Introduce el dorsal del participante menor de "
                    + "edad: ");
            dorsal = sc.nextInt();
            int indiceBusqueda = 0;
            while (indiceBusqueda < t.length && t[indiceBusqueda] != dorsal) {
                indiceBusqueda++;
            }
            if (indiceBusqueda == t.length) {
                System.out.println("Ese dorsal no se encuentra en la carrera.");
            } else {
                for (int i = indiceBusqueda; i < indiceBusqueda + 1; i++) {
                    if (i == 0) {
                        System.out.println("Ese participante no puede avanzar "
                                + "más porque ya esta en el primer lugar.");
                    } else {
                        aux = t[i];
                        t[i] = t[i - 1];
                        t[i - 1] = aux;
                        System.out.println("Dorsal Avanzado.");
                    }
                }
            }
        } while (dorsal != -1);
        return t;
    }
}