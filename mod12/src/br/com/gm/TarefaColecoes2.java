package br.com.gm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes2 {

	public static void listaNomesSexo() {
		List<String> listaNomesMasculinos = new ArrayList<String>();
		List<String> listaNomesFemininos = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome e a letra do sexo na frente. Exemplo Nome-F,: ");

		while (true) {
			String entrada = sc.nextLine();

			if (entrada.equalsIgnoreCase("sair")) {
				break;
			}
			String[] nomes = entrada.split(",");
			for (String nome : nomes) {
				if (nome.contains("-m")) {
					listaNomesMasculinos.add(nome.trim());
				} else {
					listaNomesFemininos.add(nome.trim());
				}
			}
		}

		Collections.sort(listaNomesMasculinos);
		Collections.sort(listaNomesFemininos);

		System.out.println("Grupo M: " + listaNomesMasculinos);

		System.out.println("");

		System.out.println("Grupo F: " + listaNomesFemininos);

		sc.close();
	}

	public static void main(String[] args) {
		listaNomesSexo();
	}

}
