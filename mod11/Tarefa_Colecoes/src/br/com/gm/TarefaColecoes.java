package br.com.gm;

import java.util.*;

public class TarefaColecoes {

	public static void listaNomesOrdenados() {
		List<String> listaNomes = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite nomes e separe por vígulas. Ou a palavra sair: ");

		while (true) {
			String entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("sair")) {
				break;
			}
			String[] nomes = entrada.split(",");
			for (String nome : nomes) {
				listaNomes.add(nome.trim());
			}
		}

		Collections.sort(listaNomes);

		System.out.println(listaNomes);

		sc.close();
	}

	public static void main(String[] args) {
		listaNomesOrdenados();
	}
}
