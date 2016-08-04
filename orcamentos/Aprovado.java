package orcamentos;

public class Aprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orc) {
		// TODO Auto-generated method stub
		double valor = orc.getValor() - (orc.getValor()*0.02);
		orc.setValor(valor);
		
	}

	@Override
	public void aprova(Orcamento orc) {
		throw new RuntimeException("Estado Invalido: Orcamento ja esta aprovado");
		
	}

	@Override
	public void reprova(Orcamento orc) {
		throw new RuntimeException("Estado Invalido: Orcamento ja esta aprovado");
		
	}

	@Override
	public void finaliza(Orcamento orc) {
		// TODO Auto-generated method stub
		orc.setEstadoAtual(new Finalizado());
		
	}

}
