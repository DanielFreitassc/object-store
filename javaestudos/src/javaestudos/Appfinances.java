package javaestudos;
import java.util.Scanner; 
public class Appfinances {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		System.out.print("Insira suas dispesas mensais: ");
		float dispesa = dados.nextFloat();
		
		System.out.print("Insira o seu salário mensal: ");
		float salario = dados.nextFloat();
		
		System.out.print("Se receber dinheiro extra adicione aqui senão digite: (0) :  ");
		float extra = dados.nextFloat();
		float total = salario + extra;
		System.out.println(" Seu dinheiro nesse mês é: "+ total);
		System.out.println(" Suas dispesas são: "+ dispesa);
		System.out.println(" Sobrara no final do mês: "+ (total-dispesa));
		dados.close();
	}
	
}
