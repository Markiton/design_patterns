package investimentos;

import orcamentos.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		// TODO Auto-generated method stub
		
	}

}
