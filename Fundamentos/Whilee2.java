package Fundamentos;
import java.util.Scanner;
public class While2 {
	public static void main(String[] args) {
		int x, alu;
		float nota, media=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Há  quantos  alunos em sua sala? ");
		alu = leia.nextInt();
		x=0;
		while (x <= alu) {
			x++;
			System.out.println("Informe a nota do "+"x" +"º aluno");
			nota = leia.nextFloat();
			media = media + nota;
		}
		System.out.println("Média da turma foi: ", media/alu); 
	}
}
