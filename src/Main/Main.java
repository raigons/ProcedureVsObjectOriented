package Main;

import javax.swing.JOptionPane;

import procedural.estacionamento.src.Estacionamento;
import procedural.veiculo.TipoVeiculo;
import procedural.veiculo.Veiculo;

public class Main {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args){
		//utilizando os objetos do pacote Procedural
		Estacionamento estacionamento = Main.packageProceduralEstacionamento();
		Veiculo veiculo = Main.packageProceduralCarro();
		Veiculo veiculo2 = Main.packageProceduralCaminhao();
		Veiculo veiculo3 = Main.packageProceduralMotocicleta();		
		
		
		
		//para utilizar os objetos de mesmo nome do Pacote OO
		/*oo.estacionamento.src.Estacionamento estacionamento = Main.packageOOEstacionamento();
		
		oo.veiculo.Veiculo veiculo = Main.packageOOCaminhao();		
		oo.veiculo.Veiculo veiculo2 = Main.packageOOCarro();
		oo.veiculo.Veiculo veiculo3 = Main.packageOOMotocicleta();
		*/
		
		estacionamento.estacionar(veiculo);
		estacionamento.estacionar(veiculo2);
		estacionamento.estacionar(veiculo3);
		
		JOptionPane.showMessageDialog(null, "Esperando contagem de tempo...");
		System.out.println("Custaram ao veiculo 1 $"+estacionamento.sair(veiculo));
		System.out.println("Custaram ao veículo 2 $"+estacionamento.sair(veiculo2));
		System.out.println("Custaram ao veículo 3 $"+estacionamento.sair(veiculo3));
	}
	
	/***iniciando objetos do pacote procedural***/
	private static Estacionamento packageProceduralEstacionamento(){		
		return new Estacionamento();						
	}
	
	private static Veiculo packageProceduralCarro(){
		Veiculo veiculo = new Veiculo();
		veiculo.setTipo(TipoVeiculo.carro);
		return veiculo;
	}
	
	private static Veiculo packageProceduralCaminhao(){
		Veiculo veiculo = new Veiculo();
		veiculo.setTipo(TipoVeiculo.caminhao);
		return veiculo;
	}
	
	private static Veiculo packageProceduralMotocicleta(){
		Veiculo veiculo = new Veiculo();
		veiculo.setTipo(TipoVeiculo.motocicleta);
		return veiculo;
	}
	
	
	/***iniciando objetos do pacote OO****/
		
	private static oo.veiculo.Veiculo packageOOCarro(){
		return new oo.veiculo.Carro();		
	}
	private static oo.veiculo.Veiculo packageOOCaminhao(){
		return new oo.veiculo.Caminhao();	
	}
	private static oo.veiculo.Veiculo packageOOMotocicleta(){
		return new oo.veiculo.Motocicleta();
	}
	
	private static oo.estacionamento.src.Estacionamento packageOOEstacionamento(){		
		return new oo.estacionamento.src.Estacionamento();				
	}
}
