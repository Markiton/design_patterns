package Impostos;

import orcamentos.*;

public abstract class Imposto {
	protected Imposto impostoComposto;
	
	public Imposto(Imposto impostoComposto){
		this.impostoComposto = impostoComposto;
	}
	
	public Imposto(){
		this.impostoComposto = null;
	}
	
	protected double calculaImpostoComposto(Orcamento orc){
		if (impostoComposto != null)
			return impostoComposto.calcula(orc);
		return 0;
	}
	public abstract double calcula(Orcamento orc);
}
