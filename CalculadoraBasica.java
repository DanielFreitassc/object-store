import java.util.Scanner;

class CalculadoraBasica{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite Um número:");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite mais um número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Selecione a operação desejada: ");
        System.out.println("1 Soma");
        System.out.println("2 Subtração");
        System.out.println("3 Multiplicação");
        System.out.println("4 Divisão");

        int operação = scanner.nextInt();
        double resultado = 0;

        switch (operação) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            }
            System.out.println("Resultado: " + resultado);
            scanner.close();
    }
}