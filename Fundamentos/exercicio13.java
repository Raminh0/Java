package Fundamentos;

import java.util.Scanner;

public class exercicio13 {
	public static void main(String[] args) {
		
	
	Scanner leia = new Scanner(System.in);
	
	int n1, n2, n3;
	
	System.out.println("Informe o primeiro número inteiro: ");
	n1 = leia.nextInt();
	System.out.println("Informe o segundo número inteiro: ");
	n2 = leia.nextInt();
	System.out.println("Informe o terceiro número inteiro: ");
	n3 = leia.nextInt();
	System.out.println((n1 > n2)? (n1 > n3)? n1 + " é maior que " + n2 + " " + n3 : n3 + " é maior que " + n1 + " " + n2 : (n2 > n3)? n2 + " é maior que " + n1 + " " + n3 : n3 + " é maior que " + n1 + n2);
	}
}
