package valoresMultiplos;

import java.util.Scanner;

public class inteirosMultiplos {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b ==  0 || b % a == 0)
			System.out.println("São multiplos");
		 else {
			System.out.println("não são multiplos");
		}
		
		
		sc.close();

	}

}
