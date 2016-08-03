package investimentos;

import orcamentos.Orcamento;

public class DescontoMaiorQueQuinhetos implements Desconto {
	private Desconto proximo;
	public DescontoMaiorQueQuinhetos(Desconto proximo) {
		// TODO Auto-generated constructor stub
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500)
			return 0.007;
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO Auto-generated method stub
		this.proximo = desconto;

	}

}
