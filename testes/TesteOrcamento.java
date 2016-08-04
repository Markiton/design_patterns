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

		CalculadoraDeDescontos calcD = new CalculadoraDeDescontos();

		double desc = calcD.calcula(orc);
		orc.aplicaDescontoExtra();
		System.out.println(orc.getValor());
		orc.aprova();
		orc.aplicaDescontoExtra();
		System.out.println(orc.getValor());
		orc.finaliza();
		orc.aplicaDescontoExtra();
		System.out.println(orc.getValor()); 
		
	}

}
