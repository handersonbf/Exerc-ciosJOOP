package interfaces;

public class TestaTV2 {

	public static void main(String[] args) {
		
		GerenciadorTV gtv = new GerenciadorTV();
		ControleRemoto cr1 = new AppleTV();
		ControleRemoto cr2 = new ModeloLGSmartTV();
		gtv.adiciona(cr1);
		gtv.adiciona(cr2);

		for(ControleRemoto c : gtv.getDispositivos()){
			c.status();
		}

	}

}
