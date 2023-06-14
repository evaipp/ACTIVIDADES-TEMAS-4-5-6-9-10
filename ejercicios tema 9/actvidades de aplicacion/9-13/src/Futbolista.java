import java.util.Comparator;

public class Futbolista implements Comparable {
    public static Comparator comparadorEdad;
    private String dni;
    private String nombre;
    int edad;
    private int numeroGoles;


    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.numeroGoles=numeroGoles;
    }

    @Override
    public int compareTo(Object o) {
        return dni.compareTo(((Futbolista)o).dni);
    }

    @Override
    public String toString() {
        return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles=" + numeroGoles
                + "]";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }



    

}
