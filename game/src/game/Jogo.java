package game;
import java.util.Scanner;
public class Jogo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=============================================================================================");
		System.out.println(" _____    _____    ___       ___                     _    _        _   ______       ________");
		System.out.println("|  _  \\  |   __|   | |\\\\    //| |    \\\\          // | |  | \\ \\    | | |  __  \\\\   / /    \\ \\");
		System.out.println("| |_| |  |  |__    | | \\\\  // | |     \\\\        //  | |  | |\\ \\   | | | |  | ||  | |     | |");
		System.out.println("|  ___/  |     |   | |  \\\\//  | |      \\\\      //   | |  | | \\ \\  | | | |  | ||  | |     | |");
		System.out.println("|  _  \\  |   __|   | |        | |       \\\\    //    | |  | |  \\ \\ | | | |  | ||  | |     | |");
		System.out.println("| |_| |  |  |__    | |        | |        \\\\  //     | |  | |   \\ \\| | | |__| ||  | |     | |");
		System.out.println("|_____/  |_____|   | |        | |         \\\\//      |_|  |_|    \\___| |_____//   \\ \\_____/ /");
		System.out.println("=============================================================================================");
		System.out.println("Bem Vindo Ao Japg Rpg em JAVA\n Pressione (S) para continuar...");
		String prosseguir = input.next();
		
		if(prosseguir.equals("s")){
			System.out.println("|-=-=-=-=-=-=-=-=-=|");
			System.out.println("|       Menu       |");
			System.out.println("|1      Jogar      |" );
			System.out.println("|2      Sair       |");
			System.out.println("|=-=-=-=-=-=-=-=-=-|");
			int escolha = input.nextInt();
			switch(escolha) {
			
			}
			
			
		  }
			
		else {
			System.out.println("saindo");
		}
		input.close();
	}
}