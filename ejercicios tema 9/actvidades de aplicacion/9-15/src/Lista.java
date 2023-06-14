import java.util.Arrays;

public class Lista implements Pila, Cola {

    private int numeroElementos;
    private String[] tabla;

    //Por defecto, la capacidad inicial de la lista (tamaño de la lista) es 10
    public Lista() {
        numeroElementos = 0;
        tabla = new String[10];
    }

    //Podemos hacer que la capacidad inicial sea cualquier valor pasándosela 
    //al constructor
    public Lista(int capacidadInicial) {
        numeroElementos = 0;
        tabla = new String[capacidadInicial];
    }

    //El número de elementos de la lista puede leerse desde fuera de la clase
    //aunque no modificarse
    int numeroElementos() {
        return numeroElementos;
    }

    //Método de uso interno en la clase
    protected boolean listaLLena() {//No hay elementos libres en la tabla
        return numeroElementos == tabla.length;
    }

    void insertarPrincipio(String nuevo) {
        if (listaLLena()) {//Si la tabla está llena, aumentamos en 10 su tamaño
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        for (int i = numeroElementos; i >= 1; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[0] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(String nuevo) {
        if (listaLLena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        tabla[numeroElementos] = nuevo;
        numeroElementos++;
    }

    void insertarFinal(Lista otraLista) {
        //Aumentamos la capacidad hasta que quepan los elementos de las dos
        //listas
        while (numeroElementos + otraLista.numeroElementos > tabla.length) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        for (int i = numeroElementos, j = 0; j < otraLista.numeroElementos; i++, j++) {
            tabla[i] = otraLista.tabla[j];
            numeroElementos++;
        }

    }

    void insertarFinal(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = (String) nuevo;
    }

    //El primer parámetro es el índice del lugar donde queremos insertar
    //el valor del segundo parámetro
    boolean insertar(int posicion, String nuevo) {
        boolean insertado = true;
        if (posicion < 0 || posicion > numeroElementos) {//índice no válido
            insertado = false;
        } else {
            if (listaLLena()) {
                tabla = Arrays.copyOf(tabla, tabla.length + 10);
            }
            for (int i = numeroElementos; i > posicion; i--) {
                tabla[i] = tabla[i - 1];
            }
            tabla[posicion] = nuevo;
            numeroElementos++;
        }
        return insertado;
    }

    String eliminar(int indice) {//si está vacía devuelve null
        String eliminado = null;
        if (indice >= 0 && indice < numeroElementos) {
            eliminado = tabla[indice];
            for (int i = indice; i < numeroElementos - 1; i++) {
                tabla[i - 1] = tabla[i + 1];
            }
            numeroElementos--;
        }
        return eliminado;
    }

    /*Al siguiente método le pasaremos un índice y nos devolverá el
     elemento correspondiente de la tabla sin modificarla. En el caso de que 
     el índice no sea válido, devolverá null, con lo cuál evitamos que el
     programa aborte*/
    String get(int indice) {
        String resultado = null;
        if (indice >= 0 && indice < numeroElementos) {//índice válido
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(String claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < numeroElementos && indice == -1; i++) {
            if (tabla[i] == claveBusqueda) {
                indice = i;
            }
        }
        return indice;
    }

    void ordenar() {
        /*No debemos olvidar que al final de la tabla suele haber elementos 
        null que, en una ordenación producirán errores. Por eso hay que 
        escoger el rango donde hay elementos Integer válidos*/
        Arrays.sort(tabla, 0, numeroElementos);
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < numeroElementos; i++) {
            res += tabla[i] + " ";
        }
        res += "\n";
        return res;
    }

    @Override
    public void apilar(String elem) {
        insertarFinal(elem);
    }

    @Override
    public String desapilar() {
        return eliminar(numeroElementos - 1);
    }

    @Override
    public void encolar(String elem) {
        insertarFinal(elem);
    }

    @Override
    public String desencolar() {
        return eliminar(0);
    }

    /*9.17 usar listas de Objetos */
    @Override
    public void encolar(Object elem) {
        insertarFinal(elem);
    }

}
