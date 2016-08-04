package orcamentos;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {


	private double valor;
	private List<Item> itens;
	private EstadoOrcamento estadoAtual;

	public Orcamento(double valor){
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}
	
	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}
	public void adicionaItem(Item item){
		itens.add(item);
	}
	
	public EstadoOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public void aplicaDescontoExtra(){
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estadoAtual.aprova(this);
	}
	
	public void reprova(){
		estadoAtual.reprova(this);
	}
	
	public void finaliza(){
		estadoAtual.finaliza(this);
	}
}
