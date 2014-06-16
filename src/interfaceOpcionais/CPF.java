package interfaceOpcionais;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class CPF implements Documento{

	private String documento;
	
	public CPF(String documento) {
		this.documento = documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getDocumentoComMascara() throws ParseException {
		MaskFormatter mf = new MaskFormatter("###.###.###-##");  
	    mf.setValueContainsLiteralCharacters(false);  
		return mf.valueToString(this.documento) ;
	}

}
