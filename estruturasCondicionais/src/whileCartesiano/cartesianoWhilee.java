package whileCartesiano;

import java.util.Scanner;

public class cartesianoWhilee {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = 0, y =0;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		while ( x != 0  && y !=0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Quadrante Q1");
			} else if (x < - 0 && y > 0) {
				System.out.println("Quadrante Q2");
			} else if (x >= 0 && y <= -0) {
				System.out.println("Quadrante Q4");
			} else{
				System.out.println("Quadrante Q3");
			}	
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
	
		
		sc.close();
	}

}
