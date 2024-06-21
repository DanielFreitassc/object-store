package PrimeirasAulas;
import java.util.HashSet;
import java.util.Set;

public class ColecoesHashSet {
   public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);


        numeros.remove(10);
        for(Integer elemento : numeros) {
            System.out.println(elemento);
            System.out.println(numeros.contains(20));
        }
   } 
}
