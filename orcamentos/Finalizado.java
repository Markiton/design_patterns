package orcamentos;

public class Finalizado implements EstadoOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orc) {
		throw new RuntimeException("Orcamento ja esta finalizado!");
		
	}

	@Override
	public void aprova(Orcamento orc) {
		throw new RuntimeException("Orcamento ja esta finalizado!");
		
	}

	@Override
	public void reprova(Orcamento orc) {
		throw new RuntimeException("Orcamento ja esta finalizado!");
		
	}

	@Override
	public void finaliza(Orcamento orc) {
		throw new RuntimeException("Orcamento ja esta finalizado!");
		
	}

}
