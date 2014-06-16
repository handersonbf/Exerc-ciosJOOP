package correcoes;

public class TesteContador {

	public static void main(String[] args) {
		 Runnable[] contadores = {
		    		new Contador("Handerson Frota"),
		    		new Contador("Guilherme Frota"),
		    		new Contador("Nahan Frota"),
		    		new Contador("William Frota")
		    		
		    };
		    for (int i = 0; i < contadores.length; i++){
		    	System.out.println("Iniciando....");
		    	contadores[i].run();
		    }
	}

}
