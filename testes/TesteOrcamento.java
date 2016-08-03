package testes;

import Impostos.*;
import investimentos.CalculadoraDeDescontos;
import orcamentos.*;

public class TesteOrcamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orc = new Orcamento(5000);
		orc.adicionaItem(new Item("CANETA", 250));
		orc.adicionaItem(new Item("LAPIS", 150));
		Imposto ICC = new ICC(new ISS());
		Imposto ICPP = new ICPP();
		Imposto IKCV = new IKCV();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		CalculadoraDeDescontos calcD = new CalculadoraDeDescontos();
		calc.calculaImposto(orc, ICC);
		calc.calculaImposto(orc, ICPP);
		calc.calculaImposto(orc, IKCV);
		double desc = calcD.calcula(orc);
		System.out.println(desc);
	}

}
