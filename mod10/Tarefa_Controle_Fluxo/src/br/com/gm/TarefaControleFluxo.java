package br.com.gm;

public class TarefaControleFluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1 = 5.0;
		double nota2 = 9.0;
		double nota3 = 9.0;
		double nota4 = 9.0;
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media >= 7.0) {
			System.out.println("Aluno Aprovado");
		} 
		else if (media >= 5.0) {
			System.out.println("Aluno de Recuperação");		
		}
		else {
			System.out.println("Aluno Reprovado");
		}
		
		
	}

}
