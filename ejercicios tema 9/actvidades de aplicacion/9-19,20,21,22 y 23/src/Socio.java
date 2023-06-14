import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Socio implements Comparable<Socio> {

    int id;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    /*****Sirve para ejercicio 19-20-22-23*****/
    @Override
    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }

    /***** Sirve para ejercicio 21 *****/
/*  @Override
    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Fecha de nacimiento: " +
        fechaNacimiento + "\n";
    }*/
    ///////////////////////////////////////////////////////////////

    /***** Ejercicio 19 *****/
    /*
     * @Override
     * public int compareTo(Socio otroSocio) {
     * int resultado;
     * if (edad() < otroSocio.edad()) {
     * resultado = -1;
     * } else if (edad() > otroSocio.edad()) {
     * resultado = 1;
     * } else {
     * resultado = 0;
     * }
     * return resultado;
     * }
     */

    /***** Ejercicio 20 *****/
    /*
     * @Override
     * public int compareTo(Socio ob) {
     * int res = edad() - ((Socio) ob).edad();
     * if (res == 0) {
     * res = id - ((Socio) ob).id;
     * }
     * return res;
     * }
     */

    /***** Ejercicio 21 *****/
/*  @Override
    public int compareTo(Socio otroSocio) {
        return fechaNacimiento.compareTo(otroSocio.fechaNacimiento);
    }*/

    /***** Ejercicio 22 *****/
/*  @Override
    public int compareTo(Socio otroSocio) {
        return nombre.compareTo(otroSocio.nombre);
    }*/

    /***** Ejercicio 23 *****/
    @Override
    public int compareTo(Socio otroSocio) {
        return -nombre.compareTo(otroSocio.nombre);
    }

}