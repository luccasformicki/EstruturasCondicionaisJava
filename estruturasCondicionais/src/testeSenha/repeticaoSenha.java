package testeSenha;

import java.util.Scanner;

public class repeticaoSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int senha;
		
		senha = sc.nextInt();
		
		while (senha != 2002){
			System.out.println("Senha incorreta, tente novamente!");
			senha = sc.nextInt();
		}
		
		System.out.println("Parabéns, senha correta!");
		
		
		
		sc.close();
	}

}
