package interfaces;

public class TestaTVs {

	public static void main(String[] args) {
		ModeloLGSmartTV lgSmartTV = new ModeloLGSmartTV();
		ModeloSamsumgTV samsumgTV = new ModeloSamsumgTV();
		AppleTV appleTV = new AppleTV();

		lgSmartTV.status();
		samsumgTV.status();
		appleTV.status();
		
		lgSmartTV.ligar();
		lgSmartTV.volume(40);
		lgSmartTV.mudarCanal(12);
		

		samsumgTV.ligar();
		samsumgTV.volume(40);
		samsumgTV.mudarCanal(12);
		
		appleTV.ligar();
		appleTV.volume(90);
		appleTV.mudarCanal(88);

		System.out.println("---------------------------");
		
		lgSmartTV.status();
		samsumgTV.status();
		appleTV.status();
	
	}

}
