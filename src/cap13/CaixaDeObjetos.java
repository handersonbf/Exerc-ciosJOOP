package cap13;

public class CaixaDeObjetos {
	private Object[] arrayDeObjetos = new Object[100];
	private int posicao = 0;

	public void adiciona(Object umObjetoQualquer) {
		this.arrayDeObjetos[this.posicao] = umObjetoQualquer;
		this.posicao++;
	}

	public Object pegaObjeto(int indice) {
		return this.arrayDeObjetos[indice];
	}
}
