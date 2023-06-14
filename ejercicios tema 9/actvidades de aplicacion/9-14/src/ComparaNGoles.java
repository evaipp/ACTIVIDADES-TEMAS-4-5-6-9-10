import java.util.Comparator;

public class ComparaNGoles implements Comparator {

    public int compare(Object o1, Object o2){

        return ((Futbolista)o1).getnGoles() - (((Futbolista)o2).getnGoles());
    }
}
