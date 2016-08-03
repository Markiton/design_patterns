package Impostos;

import java.util.List;

import orcamentos.*;

public class IKCV extends TaxacaoMaxMin {
	
	 public IKCV() {
		// TODO Auto-generated constructor stub
	}
	 
	 public IKCV(Imposto impostoComposto){
		 super.impostoComposto = impostoComposto;
		
	}
	
	
	@Override
	public boolean condicaoMaximaTaxa(Orcamento orc) {
		if(orc.getValor() > 500 && buscaItemAcimaDeCem(orc.getItens()))
			return true;
		return false;
	}

	private boolean buscaItemAcimaDeCem(List<Item> itens) {
		for(Item item : itens){
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

	@Override
	public double calculaTaxMax(Orcamento orc) {
		// TODO Auto-generated method stub
		return orc.getValor()*0.01 + calculaImpostoComposto(orc);
	}

	@Override
	public double calculaTaxMin(Orcamento orc) {
		// TODO Auto-generated method stub
		return orc.getValor()*0.006 + calculaImpostoComposto(orc);
	}




}
