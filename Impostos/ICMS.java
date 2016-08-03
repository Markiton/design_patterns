package Impostos;

import orcamentos.*;

public class ICMS extends Imposto {

	 public ICMS() {
		// TODO Auto-generated constructor stub
		 super();
	}
	 
	public ICMS(Imposto impostoComposto){
		super(impostoComposto);
	}

	@Override
	public double calcula(Orcamento orc) {
		// TODO Auto-generated method stub
		return orc.getValor()*0.005+calculaImpostoComposto(orc);
	}

}
