
import java.util.Scanner;

class calculadora{
    public static main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Insira o primeiro número: ");
	double numero1 =  scanner.nextDouble();
	System.out.print("Insira o segundo número: ");
	double numero2 = scanner.nextDouble();

	System.out.println("Insira o operador");
	System.out.println("1 Soma");
	System.out.println("2 Subtração");
	System.out.println("3 Multiplicação");
	System.out.println("4 Divisão");
	
	int operação = scanner.nextInt();
	double resultado = scanner.nextDouble();
	
	switch(operação){
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
	System.out.println("Resultado: "+ resultado);
	    scanner.stop();
    }
}
