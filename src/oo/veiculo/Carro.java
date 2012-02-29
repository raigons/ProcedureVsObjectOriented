package oo.veiculo;

import oo.vaga.src.Vaga;

public class Carro implements Veiculo{
	
	private String placa;
	private Vaga vaga;
	
	public void estacionar(Vaga v){
		this.vaga = v;
		this.vaga.ocupar(this);
	}
	
	public void sair(){
		this.vaga.setOcupante(null);
		this.vaga = null;
	}
	
	public Vaga getVaga(){
		return this.vaga;
	}

}
