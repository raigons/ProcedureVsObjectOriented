package oo.veiculo;

import oo.vaga.src.Vaga;

public interface Veiculo {
		
	public void estacionar(Vaga v);
	
	public void sair();
	
	public Vaga getVaga();
}
