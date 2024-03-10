package tabelaDePreco;

import java.util.Scanner;

public class precosLanches {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double cQuente = 4.00, xSalada = 4.50, xBacon = 5.00, tSimples = 2.00, refri = 1.50, valorFinal;
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x == 1) {
			valorFinal = y * cQuente;
		} else if (x == 2) {
			valorFinal = y * xSalada;
		} else if (x == 3) {
			valorFinal = y * xBacon;
		} else if(x == 4) {
			valorFinal = y * tSimples;
		} else {
			valorFinal = y * refri;
		}
		
		System.out.printf("Total: %.2f%n", valorFinal);
		
		
		
		sc.close();

	}

}
