import java.util.Comparator;

public class ComparaNombre implements Comparator {

    public int compare(Object o1, Object o2){

        return ((Futbolista)o1).getNombre().compareTo(((Futbolista)o2).getNombre());
    }
}
