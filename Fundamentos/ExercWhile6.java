package Fundamentos;

public class ExercWhile6 {
	public static void main(String[] args) {
		int n = 100;
	
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
