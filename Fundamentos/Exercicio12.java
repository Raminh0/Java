package Fundamentos;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Me diga o seu nome");
		String nome = leia.nextLine();
		System.out.println("Informe um valor: ");
		int resp = leia.nextInt();
		
		System.out.println( (resp > 0)? (nome + " Informou " + resp + " que é positivo") : (resp < 0) ? (nome + " Informou " + resp + " que é negativo") : (nome + " Informou " + resp + " que é neutro"));
		
	}
}
