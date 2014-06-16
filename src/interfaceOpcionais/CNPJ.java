package interfaceOpcionais;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class CNPJ implements Documento{

	private String documento;
	
	public CNPJ(String documento){
		this.documento = documento;
	}
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public String getDocumentoComMascara() throws ParseException {
		MaskFormatter mf = new MaskFormatter("##.###.###/####-##");  
	    mf.setValueContainsLiteralCharacters(false);  
		return mf.valueToString(this.documento) ;
	}
	
}
