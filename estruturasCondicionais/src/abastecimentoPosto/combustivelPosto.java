package abastecimentoPosto;

import java.util.Scanner;

public class combustivelPosto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, Alcool = 0, Gasolina = 0, Diesel = 0;

		while (true) {
		    x = sc.nextInt();

		    if (x == 4) {
		        System.out.println("muito obrigado");
		        System.out.println("Alcool:" + Alcool);
		        System.out.println("Gasolina:" + Gasolina);
		        System.out.println("Diesel:" + Diesel);
		        break;
		    } else {
		        switch (x) {
		            case 1:
		                Alcool++;
		                break;
		            case 2:
		                Gasolina++;
		                break;
		            case 3:
		                Diesel++;
		                break;
		            default:
		                System.out.println("Número inválido");
		                break;
		        }
		    }
		}

		

		sc.close();

	}

}
