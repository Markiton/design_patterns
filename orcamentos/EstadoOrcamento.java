package orcamentos;

public interface EstadoOrcamento {
	public void aplicaDescontoExtra(Orcamento orc);
	public void aprova(Orcamento orc);
	public void reprova(Orcamento orc);
	public void finaliza(Orcamento orc);
}
