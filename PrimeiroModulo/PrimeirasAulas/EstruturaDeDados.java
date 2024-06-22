package PrimeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Daniel");
        nomes.add("Luiz");
        nomes.add("Naum");


        System.out.println(nomes);
        System.out.println(nomes.get(1));

        nomes.forEach(nome -> System.out.println("O nome é " + nome));
    }
}
