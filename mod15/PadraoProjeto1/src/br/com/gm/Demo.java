package br.com.gm;

public class Demo {

	public static void main(String[] args) {
		CarFactory factoryCar = new HondaFactory();
		
		Hatch carroHatch = factoryCar.criarCarroHatch();
		
		Sedan carroSedan = factoryCar.criarCarroSedan();
		
		carroHatch.mostrarInfoCarro();
		System.out.println();
		
		carroSedan.mostrarInfoCarro();
		System.out.println();
		
		factoryCar = new ToyotaFactory();
		
		carroHatch = factoryCar.criarCarroHatch();
		
		carroSedan = factoryCar.criarCarroSedan();
		
		carroHatch.mostrarInfoCarro();
		System.out.println();
		
		carroSedan.mostrarInfoCarro();
		System.out.println();
	}

}
