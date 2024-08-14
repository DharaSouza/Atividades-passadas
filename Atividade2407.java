package segundoSemestre;

import java.util.Scanner;

public class Atividade2407 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int  num, soma = 0;


		for (int i=1; i<5; i++) {
			System.out.println("Informe um número: ");
			num = ler.nextInt();
			soma+=num;
		}
		System.out.println("A soma dos números é igual: " + soma);
	}


}
