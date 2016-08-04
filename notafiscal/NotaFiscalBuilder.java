package notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import orcamentos.Item;

public class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double imposto;
    private Calendar dataEmissao;
    private String observacoes;
    private List<Item> itens = new ArrayList<Item>();
    
    public NotaFiscal builder(){
    	return new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, imposto, observacoes, itens);
    }
    
    public NotaFiscalBuilder paraEmpresa(String nome){
    	this.razaoSocial = nome;
    	return this;
    }
    
    public  NotaFiscalBuilder comCnpj(String valor){
    	this.cnpj = valor;
    	return this;
    }
    
    public NotaFiscalBuilder comItem(Item item){
    	this.itens.add(item);
    	this.valorBruto = this.valorBruto + item.getValor();
    	this.imposto = 	this.imposto + (item.getValor() * 0.005);
    	return this;
    }
   
    public NotaFiscalBuilder comObservacoes(String obs){
    	this.observacoes = obs;
    	return this;
    }
    
    public NotaFiscalBuilder naDataAtual(){
    	this.dataEmissao = Calendar.getInstance();
    	return this;
    }
 
}
