package Impostos;

import orcamentos.*;

public abstract class TaxacaoMaxMin extends Imposto {

	@Override
	public double calcula(Orcamento orc) {
		if (condicaoMaximaTaxa(orc))
			return calculaTaxMax(orc);
		return calculaTaxMin(orc);
	}
	
	public abstract boolean condicaoMaximaTaxa(Orcamento orc);
	public abstract double calculaTaxMax(Orcamento orc);
	public abstract double calculaTaxMin(Orcamento orc);

}
