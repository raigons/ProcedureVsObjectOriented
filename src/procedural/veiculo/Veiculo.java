package procedural.veiculo;

import java.util.Date;

public class Veiculo {
	private String placa;
	
	private Date entrada;
	
	private int vaga  = -1;
	
	private String tipo;
		
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public int getVaga() {
		return vaga;
	}

	public void setVaga(int vaga) {
		this.vaga = vaga;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return this.tipo;
	}
}
