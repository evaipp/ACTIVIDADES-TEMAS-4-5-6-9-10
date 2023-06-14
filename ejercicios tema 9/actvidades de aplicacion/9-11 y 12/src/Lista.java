import java.util.Arrays;

public class Lista implements Cola, Pila{
    String[] tabla;

    public Lista() {
        tabla = new String[0];
    }

    void insertarPrincipio(String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    void insertar(int posicion, String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    String eliminar(int indice) {
        String eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    String get(int indice) {
        String resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    public void mostrar() {
        System.out.println(Arrays.toString(tabla));
    }

    @Override
    public void encolar(String nuevo) {
        insertarFinal(nuevo);
    }

    @Override
    public String desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(String elemento) {
        insertarFinal(elemento);
    }

    @Override
    public String desapilar() {
        return eliminar(tabla.length - 1);
    }
}