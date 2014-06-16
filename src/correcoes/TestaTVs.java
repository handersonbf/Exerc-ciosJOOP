package correcoes;



public class TestaTVs {

	public static void main(String[] args) {
		ControleRemoto lgSmartTV = new ModeloLGSmartTV();
		ControleRemoto samsumgTV = new ModeloSamsumgTV();
		ControleRemoto appleTv = new AppleTV();

		//exibe o status do dispositivo
		lgSmartTV.status();
		samsumgTV.status();
		appleTv.status();
		
		//executa operações básicas no dispositivo
		lgSmartTV.ligar();
		lgSmartTV.volume(40);
		lgSmartTV.mudarCanal(12);
		

		samsumgTV.ligar();
		samsumgTV.volume(40);
		samsumgTV.mudarCanal(12);

		appleTv.ligar();
		appleTv.volume(50);
		appleTv.mudarCanal(26);
		
		System.out.println("---------------------------");
		
		lgSmartTV.status();
		samsumgTV.status();
		appleTv.status();
	
	}

}
