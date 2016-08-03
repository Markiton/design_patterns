package testes;

import Impostos.*;
import investimentos.CalculadoraDeDescontos;
import orcamentos.*;

public class TesteOrcamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orc = new Orcamento(100);
		orc.adicionaItem(new Item("CANETA", 250));
		orc.adicionaItem(new Item("LAPIS", 150));
		Imposto ICC = new ICC();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		CalculadoraDeDescontos calcD = new CalculadoraDeDescontos();
		calc.calculaImposto(orc, ICC);
		double desc = calcD.calcula(orc);
		System.out.println(desc);
	}

}
