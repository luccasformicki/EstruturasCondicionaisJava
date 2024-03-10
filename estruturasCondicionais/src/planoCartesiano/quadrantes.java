package planoCartesiano;

import java.util.Locale;
import java.util.Scanner;

public class quadrantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x >= 0.1 && y >= 0.1) {
			System.out.println("Quadrante Q1");
		} else if (x <= - 0.1 && y >= 0.1) {
			System.out.println("Quadrante Q2");
		} else if (x >= 0.1 && y <= -0.1) {
			System.out.println("Quadrante Q4");
		} else if (x <= -0.1 && y <= -0.1) {
			System.out.println("Quadrante Q3");
		} else {
			System.out.println("Você está no ponto zero (A origem)");
		}
		
		
		
		sc.close();
	}

}
