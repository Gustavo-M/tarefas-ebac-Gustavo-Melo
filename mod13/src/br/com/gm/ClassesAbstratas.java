package br.com.gm;

public class ClassesAbstratas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Gustavo");
		pf.setCpf("12365478987");
		System.out.println(pf.getNome()+ " - " + pf.getCpf());
	}

}
