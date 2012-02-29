package oo.estacionamento.src;

import java.util.HashMap;
import java.util.Map;

import oo.vaga.src.Vaga;
import oo.veiculo.Veiculo;

public class Estacionamento {

	public static double VALOR_HORA;
	
	private Vaga[] vagas = new Vaga[5];
	
	private static final Map<String, Double> valores = new HashMap<String, Double>(); 
	
	public Estacionamento(){		
		initValores();
		initVagas();		
	}
	
	private void initValores(){
		valores.put("Carro", 2.0);
		valores.put("Caminhao", 3.5);
		valores.put("Motocicleta", 1.85);
	}
	
	private void initVagas(){
		for(int i = 0; i < 5; i++){
			this.vagas[i] = new Vaga();
		}
	}
	
	public static Double valorHora(Veiculo veiculo){
		return valores.get(veiculo.getClass().getSimpleName());
	}
	
	public boolean estacionar(Veiculo veiculo){
		Vaga vagaLivre = this.vagaLivre();
		if(vagaLivre == null)
			return false;
			
		veiculo.estacionar(vagaLivre);
		return true;
	}
	
	public double sair(Veiculo v){
		Vaga vagaOcupada = v.getVaga();
		Double valor = vagaOcupada.valor();
		v.sair();
		return valor;	
	}
	
	private Vaga vagaLivre(){
		for(int i = 0; i < this.vagas.length; i++){
			if(this.vagas[i].livre())
				return this.vagas[i];
		}
		return null;
	}
}
