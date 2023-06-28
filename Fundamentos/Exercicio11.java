package Fundamentos;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	double resp; String nome;
	
	System.out.println("Informe o seu nome");
	nome = leia.nextLine(); 
	System.out.println("Digite um número: ");
	resp = leia.nextDouble();
	System.out.println("O número que " + nome +" digitou foi: " + resp);
	
	}
}
