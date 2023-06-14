import java.util.Comparator;

public class ComparaEdadNombre implements Comparator {

    public int compare(Object o1, Object o2){
        if (((Futbolista)o1).getEdad() - (((Futbolista)o2).getEdad())==0){
            return ((Futbolista)o1).getNombre().compareTo(((Futbolista)o2).getNombre());
        }

        return ((Futbolista)o1).getEdad() - (((Futbolista)o2).getEdad());

    }
}
