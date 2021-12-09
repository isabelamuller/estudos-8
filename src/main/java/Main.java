import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("pizza de calabresa");
        h.add("pizza de queijo");
        h.add("pizza de presunto");
        h.add("pizza de brocolis");

        System.out.println(h.contains("pizza de rucula")); // se tem esse objeto no set
        System.out.println(h.size()); // qnts objetos tem o set
        System.out.println(h); // os objetos
        System.out.println(h.isEmpty()); // se o set ta vazio 





    }
}
