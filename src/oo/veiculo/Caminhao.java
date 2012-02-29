package oo.veiculo;

import oo.vaga.src.Vaga;

public class Caminhao implements Veiculo{

	private String placa; 
	
	private Vaga vaga;
	
	@Override
	public void estacionar(Vaga v) {
		this.vaga = v;
		this.vaga.ocupar(this);
	}

	@Override
	public Vaga getVaga() {
		return this.vaga;
	}

	@Override
	public void sair() {
		this.vaga.setOcupante(null);
		this.vaga = null;
	}

}
