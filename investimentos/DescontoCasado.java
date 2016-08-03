package investimentos;

import orcamentos.*;

public class DescontoCasado implements Desconto {

	private Desconto proximo;
	
	public DescontoCasado(Desconto proximo){
		this.proximo = proximo;
	}
	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if(existe("LAPIS", orcamento) && existe("CANETA", orcamento))
			return 0.005;
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO Auto-generated method stub
		this.proximo = desconto;
	}
	
	private boolean existe(String nomeItem, Orcamento orcamento){
		for (Item item : orcamento.getItens()){
			if(nomeItem.equals(item.getNome()))
				return true;
		}
		return false;
		
	}

}
