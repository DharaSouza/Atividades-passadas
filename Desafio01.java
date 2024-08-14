package segundoSemestre;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int semana1, semana2, semana3, semana4,soma,bônus,vendas;

		System.out.println("Informe o valor da venda da primera semana do mes: ");
		semana1 = ler.nextInt();

		System.out.println("Informe o valor da venda da segunda semana do mes: ");
		semana2 = ler.nextInt();

		System.out.println("Informe o valor da venda da terceira semana do mes: ");
		semana3 = ler.nextInt();

		System.out.println("Informe o valor da venda da quarta semana do mes: ");
		semana4 = ler.nextInt();

		soma = semana1+semana2+semana3+semana4;

		switch (soma) {

		case 1:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 2:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 3:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 4:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 5:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 6:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 7:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 8:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 9:
			System.out.println("Infelizmente, não há bônus disponível para você");
			break;

		case 10:
			System.out.println("Você receberá um bÔnus de R$100,00");
			break;

		case 11:
			System.out.println("Você receberá um bÔnus de R$100,00");
			break;

		case 12:
			System.out.println("Você receberá um bÔnus de R$100,00");
			break;

		case 13:
			System.out.println("Você receberá um bÔnus de R$100,00");
			break;

		case 14:
			System.out.println("Você receberá um bÔnus de R$100,00");
			break;

		case 15:
			System.out.println("Você receberá um bÔnus de R$300,00");
			break;
			
		case 16:
			System.out.println("Você receberá um bÔnus de R$300,00");
			break;
			
		case 17:
			System.out.println("Você receberá um bÔnus de R$300,00");
			break;
			
		case 18:
			System.out.println("Você receberá um bÔnus de R$300,00");
			break;
			
		case 19:
			System.out.println("Você receberá um bÔnus de R$300,00");
			break;
			
		case 20:
			System.out.println("Você receberá um bÔnus de R$300,00");
			break;
			
		default:
			System.out.println("Você receberá um bÔnus de R$500,00");
			
			
			
			
			
		}






	}

}
