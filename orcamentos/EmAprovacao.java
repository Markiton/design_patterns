package orcamentos;

public class EmAprovacao implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orc) {
		// TODO Auto-generated method stub
		double valor = orc.getValor() - (orc.getValor() * 0.05);
		orc.setValor(valor);
		
	}

	@Override
	public void aprova(Orcamento orc) {
		// TODO Auto-generated method stub
		orc.setEstadoAtual(new Aprovado());
		
	}

	@Override
	public void reprova(Orcamento orc) {
		// TODO Auto-generated method stub
		orc.setEstadoAtual(new Reprovado());
		
	}

	@Override
	public void finaliza(Orcamento orc) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Estado invalido: Orcamento ainda esta em aprovacao");
		
	}

}
