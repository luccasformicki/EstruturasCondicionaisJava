package ImpostoDeRenda;

import java.util.Locale;
import java.util.Scanner;

public class Renda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda, debito;
		
		renda = sc.nextDouble();
		
		if (renda <= 2000.00) {
			debito = 0.00;
		} else if (renda <= 3000.00) {
			debito = (renda - 2000) * 0.08;
			System.out.println("total a pagar:" + debito );
		} else if (renda <= 4500.00) {
			debito = (renda -3000) * 0.18  +1000 * 0.08;
		} else {
			debito = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		 System.out.printf("R$ %.2f", debito);
		
		sc.close();
	}

}
