package javaestudos;
import java.util.Scanner; 
public class Appfinances {
	private static String nome;
	public static void main(String[] args) {
	 	
		Scanner dados = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome = dados.nextLine();
		
		System.out.print("Insira suas dispesas mensais: ");
		float dispesa = dados.nextFloat();
		
		System.out.print("Insira o seu salário mensal: ");
		float salario = dados.nextFloat();
		
		System.out.print("Se receber dinheiro extra adicione aqui senão digite: (0) :  ");
		float extra = dados.nextFloat();
		float total = salario + extra;
		System.out.println("Olá "+ nome + " Seja Bem Vindo(a)! ");
		System.out.println(" Seu dinheiro nesse mês é: "+ total);
		System.out.println(" Suas despesas são: "+ dispesa);
		if (total-dispesa >=0) {
		System.out.println("------------------------------------------");
		System.out.println(" Sobrara no final do mês: "+ (total-dispesa));
		}
		else {
		System.out.println("------------------------------------------");
		System.out.println("Você está devendo: "+ (total-dispesa));
		}
		dados.close();
	}
	
}
