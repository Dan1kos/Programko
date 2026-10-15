package arnold_week2;
import java.time.Year;

public class Sentence {
    public static void main(String[] args) {
        //in
        String jmeno = "Petr";
        int rok = 2011;
        char trida = 'B';
        int vek = Year.now().getValue() - rok;

        //out
        System.out.println("Dite " + jmeno + " ma " + vek + " let a chodi do " + (vek-6) + "."+ trida + ".");

    }
}
