package jogo;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1- Jogar");
		System.out.println("2- Sair ");
		
		int escolha = input.nextInt();
	 
		switch(escolha) {
		case 1:
			System.out.println("1- Jogo solo");
			System.out.println("2- Jogo Online");
			int novoMenu = input.nextInt();
				
			if(novoMenu == 1) {
				System.out.println("jogando solo");
			}
			else if(novoMenu == 2) { 	
				System.out.println("jogando online");
			
			}
			break;
		case 2:
			System.out.println("Saindo");
				break;
		default:
			System.out.println("Escolha Invalida");
			break;
		}
	
		input.close();
	
	}
 
}
