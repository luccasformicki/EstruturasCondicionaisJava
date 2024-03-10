package imparOuPar;

import java.util.Scanner;

public class NumeroImparOuPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0)
			System.out.println("par");
		else {
			System.out.println("Impar");
		}
		
		
		sc.close();

	}

}
