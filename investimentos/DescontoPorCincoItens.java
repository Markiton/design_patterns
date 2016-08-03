package investimentos;

import orcamentos.Orcamento;

public class DescontoPorCincoItens implements Desconto {
	private Desconto desconto;
	public DescontoPorCincoItens(Desconto proximo) {
		// TODO Auto-generated constructor stub
		this.desconto = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5)
			return 0.01;
		return desconto.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO Auto-generated method stub
		this.desconto = desconto;
	}

	public Desconto getDesconto() {
		return desconto;
	}

}
