package Fundamentos;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Informe um número de 1-7: ");
		int dia = leia.nextInt();
		
		//System.out.println((dia == 1)? " Domingo":(dia == 2)?" Segunda":(dia == 3)?" Terça":(dia == 4)?" Quarta":(dia == 5)?" Quinta":(dia == 6)?" Sexta":(dia == 7)?" Sábado":" NÚMERO INVÁLIDO!");
		
		if (dia == 1){System.out.println("Domingo");
		}else if(dia == 2) {
			System.out.println("Segunda-feira");
		}else if(dia == 3) {
			System.out.println("Terça-feira");
		}else if(dia == 4) {
			System.out.println("Quarta-feira");
		}else if(dia == 5) {
			System.out.println("Quinta-feira");
		}else if(dia == 6) {
			System.out.println("Sexta-feira");
		}else if(dia == 7) {
			System.out.println("Sábado-feira");
		}else{System.out.println("Número inválido!");}
	}

}
