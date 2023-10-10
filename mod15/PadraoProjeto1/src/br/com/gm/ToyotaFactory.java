package br.com.gm;

public class ToyotaFactory implements CarFactory{

	@Override
	public Hatch criarCarroHatch() {
		return new Hatch();
	}

	@Override
	public Sedan criarCarroSedan() {
		return new Sedan();
	}

}
