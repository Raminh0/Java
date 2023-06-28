package Fundamentos;

public class ExercWhile3 {

	public static void main(String[] args) {
		int x = 0, n = 100;
		System.out.println("Números pares: ");
		while ( x < n) {
			x++;
			if (x % 2 == 0){
				System.out.print(x + " ");
			}
		}
		System.out.println();
		System.out.println("Números impares: ");
		x = 0;
		while(x < n) {
			x++;
			if (x % 2 == 1){
				System.out.print(x + " ");
			}
		}

	}

}
