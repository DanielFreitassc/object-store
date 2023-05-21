import java.util.Scanner;
class NumerosImpares{
    public static void main(String[] args){
        System.out.print("Digite um número: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero % 2 == 0){
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é impar!");
        }
        
     teclado.close();
    }
}