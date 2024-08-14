package segundoSemestre;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o 1º numero: ");
		numero = ler.nextInt();
		System.out.println("Informe o 2º numero: ");
		numero = ler.nextInt();
		System.out.println("Informe o 3º numero: ");
		numero = ler.nextInt();
		System.out.println("Informe o 4º numero: ");
		numero = ler.nextInt();

		if (numero % 2 == 0){
			System.out.println(numero + " é um número par!");
			}
		else {
			System.out.println(numero + " é um número invalido!" );
		}
        ler.close();


	}

}
