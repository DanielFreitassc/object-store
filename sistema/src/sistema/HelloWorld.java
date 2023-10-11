package sistema;
import java.util.Scanner;
public class HelloWorld {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Login");
		System.out.print("Nome: ");
		String nome = input.nextLine();
		System.out.println("MENU");
		System.out.print(" 1- (Cadastrar produto )\n 2- (Gerar Relátorio)\n 3- (Sair)");
		int escolha = input.nextInt();
		int escolhido = 0;
		switch(escolha) {
		case 1:
			System.out.print("Cadastrando..");
			break; 
		case 2:
			System.out.print("gerando...");
			break;
		case 3:
			System.out.print("Saindo..");
			break;
		}

		
		
		
		
		input.close();
	}
	
}	
 