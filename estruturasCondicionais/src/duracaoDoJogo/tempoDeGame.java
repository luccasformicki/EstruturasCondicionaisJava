package duracaoDoJogo;

import java.util.Scanner;

public class tempoDeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xE, yS, duracao;
		
		xE = sc.nextInt();
		yS = sc.nextInt();
		
		if (xE < yS) {
			duracao = yS - xE;
		}else {
			duracao = 24 - xE + yS;
		}
		
		System.out.println("o Jogo durou:" + duracao + "hora(s)");
		
		
		sc.close();
	}

}
