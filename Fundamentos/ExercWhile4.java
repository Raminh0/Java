package Fundamentos;

import java.util.Scanner;

public class ExercWhile4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = 0, n = 100;
		
		System.out.println("Informe até o número que você gostaria de saber ");
		n = leia.nextInt();
		
		System.out.println("\nNúmeros pares: ");
		while ( x < n) {
			x++;
			if (x % 2 == 0){
				System.out.print(x + " ");
			}
		}
		
		System.out.println("\nNúmeros impares: ");
		x = 0;
		while(x < n) {
			x++;
			if (x % 2 == 1){
				System.out.print(x + " ");
			}
		}
	}
}
