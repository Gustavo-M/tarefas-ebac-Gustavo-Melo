package br.com.gm;

public class Carro {
	
	/*
	 * Alguns atributos da Classes carro
	 */
	private String marca;
	private String modelo;
	private int ano;

	/*
	 * Métodos da Classes para ligar e desligar o carro
	 */
	public void ligar() {
		System.out.println("O carro está ligado.");
	}

	public void desligar() {
		System.out.println("O carro está desligado.");
	}

	// Getters e Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
