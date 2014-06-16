package cap16;

public class TesteContador {

	 public static void main(String[] args) {
		    Contador[] contadores = {
		    		new Contador("Handerson Frota", 2),
		    		new Contador("Guilherme Frota", 3),
		    		new Contador("Nahan Frota"),
		    		new Contador("William Frota")
		    		
		    };
		    for (int i = 0; i < contadores.length; i++){
		    	contadores[i].start();
		    }
	 }

}
