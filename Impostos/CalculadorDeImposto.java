package Impostos;

import orcamentos.Orcamento;

public class CalculadorDeImposto {
	public void calculaImposto(Orcamento orc, Imposto imp){
		double taxa = imp.calcula(orc);
		System.out.println(taxa);
	}
}
