package orcamentos;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orc) {
		throw new RuntimeException("Orcamento foi reprovado!");		
	}

	@Override
	public void aprova(Orcamento orc) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Orcamento foi reprovado!");
	}

	@Override
	public void reprova(Orcamento orc) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Orcamento foi reprovado!");
	}

	@Override
	public void finaliza(Orcamento orc) {
		// TODO Auto-generated method stub
		orc.setEstadoAtual(new Finalizado());
		
	}

}
