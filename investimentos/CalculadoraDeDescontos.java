package investimentos;

import orcamentos.Orcamento;

public class CalculadoraDeDescontos {
	public double calcula(Orcamento orcamento){
		Desconto d4 = new SemDesconto();
		Desconto d3 = new DescontoCasado(d4);
		Desconto d2 = new DescontoMaiorQueQuinhetos(d3);
		Desconto d1  =  new DescontoPorCincoItens(d2);
		
		return d1.desconta(orcamento);
		
	}
}
