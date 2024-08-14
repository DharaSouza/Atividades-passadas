package segundoSemestre;

import java.util.ArrayList;

import java.util.Arrays;

public class exemplos {

	public static void main(String[] args) {
		
		String[] disciplinas = {"matematica", "filosofia", "história","física"};
		
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		
		novaLista.add("geografia");
		
		novaLista.add("língua Ingresa");

		for (String i: novaLista)
		{
			System.out.println("disciplina: " + i);
		}
	}

}
