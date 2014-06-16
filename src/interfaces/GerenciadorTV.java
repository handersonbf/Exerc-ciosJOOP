package interfaces;

public class GerenciadorTV {

	private static ControleRemoto[] array = new ControleRemoto[10];
	
	public void adiciona(ControleRemoto cr) {
		for(int i=0;i<array.length;i++){
			if(array[i] == null){
				array[i] = cr;
				break;
			}
		}
		
	}

	public ControleRemoto[] getDispositivos() {
		return GerenciadorTV.array;
	}

}
