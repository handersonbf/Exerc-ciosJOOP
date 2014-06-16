package correcoes;

public class TesteAluguelImoveis {

	public static void main(String[] args) {
		Imovel imovel = new Imovel();
		Casa casa = new Casa();
		Apartamento apartamento = new Apartamento();
		
		imovel.setValor(25000);
		casa.setValor(25000);
		apartamento.setValor(25000);
		
		System.out.println(imovel.getIptu());
		System.out.println(imovel.getAluguel());
		
		System.out.println(casa.getIptu());
		System.out.println(casa.getAluguel());

		System.out.println(apartamento.getAluguel());
		System.out.println(apartamento.getIptu());
		
		ComissaoCorretor comissao = new ComissaoCorretor();
		
		comissao.registraComissao(imovel);
		comissao.registraComissao(casa);
		comissao.registraComissao(apartamento);

		System.out.println(comissao.getTotalDeComissao());
	}
}