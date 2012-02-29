package oo.vaga.src;

import java.util.Date;

import oo.estacionamento.src.Estacionamento;
import oo.veiculo.Carro;
import oo.veiculo.Veiculo;

public class Vaga {

	private Date entrada;
	private Veiculo ocupante;
	
	public void ocupar(Veiculo veiculo){
		this.ocupante = veiculo;
		this.entrada = new Date();
	}
	
	public void setOcupante(Veiculo veiculo){
		this.ocupante = veiculo;
	}
	
	public double valor(){
		return (this.horasOcupadas(this.entrada)* Estacionamento.valorHora(this.ocupante));
	}
	
	private long horasOcupadas(Date entrada){
		return (new Date().getTime() - entrada.getTime())/1000;		
	}
	
	public boolean livre(){
		return (this.ocupante == null);
	}
}
