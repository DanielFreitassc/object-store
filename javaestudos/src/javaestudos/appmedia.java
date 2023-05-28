package javaestudos;

import java.util.Scanner; 
public class appmedia {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota: ");
		float nota1 = leitor.nextFloat();
		
		System.out.print("Insira a segunda nota: ");
		float nota2 = leitor.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		System.out.println("Sua média foi: " + media);
		
		if (media >= 7){
			System.out.println("Parabéns!!");
		}
		else {
			System.out.println("Estude um pouco mais!");
		}
		leitor.close();
	}

}
