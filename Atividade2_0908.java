package segundoSemestre;

import java.util.Scanner;

import java.util.ArrayList;

public class Atividade2_0908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Digite números inteiros (digite '0' para finalizar):");
		while (true) {
			int numero = Scanner.nextInt();
			if (numero == 0) {
				break;
			}
			numeros. add (numero);
		}
		if (todosPositivos (numeros)) {
			System.out.println("Todos os números são positivos.");
		} else {
			System.out.println(" Nem todos os números são positivos. ");
		}
	}

	public static boolean todosPositivos (ArrayList<Integer> numeros) {
		for (int numero: numeros) {
			if (numero <= 0) {
				return false;
			}
		}
		return true;
	}
}

