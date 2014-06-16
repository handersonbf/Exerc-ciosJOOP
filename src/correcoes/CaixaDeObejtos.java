package correcoes;

public class CaixaDeObejtos {

	private Object[] objetos = new Object[100];
	private int posicao = 0;
	
	public void adiciona(Object objetoQualquer) {
		this.objetos[this.posicao] = objetoQualquer;
		this.posicao++;
	}
	
	public Object pegaObject(int indice){
		return this.objetos[indice];
	}
}
