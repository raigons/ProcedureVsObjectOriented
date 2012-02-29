package procedural.estacionamento.src;

import java.util.Date;

import procedural.veiculo.TipoVeiculo;
import procedural.veiculo.Veiculo;

public class Estacionamento {
			
	private Veiculo[] vagas = new Veiculo[5];
	
	public boolean estacionar(Veiculo c){
		int vagaLivre = this.encontraVagaLivre();
		if(vagaLivre == -1)
			return false;
		
		c.setEntrada(new Date());		
		this.vagas[vagaLivre] = c;
		c.setVaga(vagaLivre);
		return true;
	}
	
	public double sair(Veiculo v){
		int vagaOcupada = v.getVaga();
		Date dataEntrada = v.getEntrada();
		double valor = this.horasOcupadas(dataEntrada) * this.valorHora(v); 
		v.setVaga(-1);
		this.vagas[vagaOcupada] = null;
		v.setEntrada(null);
		return valor;
	}
	
	
	private double valorHora(Veiculo v){
		if(v.getTipo() == TipoVeiculo.carro){
			return 2.0;
		}else if(v.getTipo() == TipoVeiculo.caminhao)
			return 3.5;
		else if(v.getTipo() == TipoVeiculo.motocicleta)
			return 1.85;
		return 0;
	}
	
	private int encontraVagaLivre(){
		for(int i = 0; i < this.vagas.length; i++){
			if(this.vagas[i] == null)
				return i;
		}
		return -1;
	}
	
	private long horasOcupadas(Date entrada){	
		long diff = (new Date().getTime() - entrada.getTime())/1000;
		return diff;
	}
	
}
