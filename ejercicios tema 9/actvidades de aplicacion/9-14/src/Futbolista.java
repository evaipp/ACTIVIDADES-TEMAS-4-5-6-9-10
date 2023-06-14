
public class Futbolista implements Comparable{
    private String dni;
    private String nombre;
    private int edad;
    private int nGoles;

    public Futbolista(String dni, String nombre, int edad, int nGoles){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.nGoles=nGoles;
    }

    public int compareTo(Object o){
        return dni.compareTo(((Futbolista)o).dni);
    }

    public String toString() {
        return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", nGoles=" + nGoles + "]";
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getnGoles() {
        return nGoles;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setnGoles(int nGoles) {
        this.nGoles = nGoles;
    }

}