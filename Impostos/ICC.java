package Impostos;

import orcamentos.*;

public class ICC extends Imposto {

	public ICC() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ICC(Imposto impostoComposto){
		super(impostoComposto);
	}
	
	
	@Override
	public double calcula(Orcamento orc) {
		if (orc.getValor() < 1000)
			return orc.getValor()*0.005 + calculaImpostoComposto(orc);
		if (orc.getValor() >= 1000 && orc.getValor() <= 3000)
			return orc.getValor()*0.007 + calculaImpostoComposto(orc);
		return (orc.getValor()*0.008) + 30 + calculaImpostoComposto(orc);
	}
	
	

}
