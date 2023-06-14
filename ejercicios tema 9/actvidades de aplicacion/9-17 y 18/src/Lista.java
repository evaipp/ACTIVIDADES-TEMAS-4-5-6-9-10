import java.util.Arrays;
public class Lista implements Pila, Cola {
    Object tabla[];
    
    Lista() {
        tabla = new Object[0];
    }

    void insertarPrincipio(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;//tamaño inicial tabla
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    /*El primer parámetro es el índice del lugar donde queremos 
    insertar el valor del segundo parámetro*/
    void insertar(int posicion, Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1,
                tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    Object eliminar(int indice) {
        Object eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    Object get(int indice) {
        Object resultado = null;
        if (indice >= 0 && indice < tabla.length) {//índice válido
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(Object claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    @Override
    public String toString() {//mostramos la tabla
        return Arrays.deepToString(tabla);
    }

    @Override
    public void apilar(Object elem) {
        insertarFinal(elem);
    }

    @Override
    public Object desapilar() {
        return eliminar(tabla.length - 1);
    }

    @Override
    public void encolar(Object elem) {
        insertarFinal(elem);
    }

    @Override
    public Object desencolar() {
        return eliminar(0);
    }
}