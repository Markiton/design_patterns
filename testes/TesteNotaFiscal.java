package testes;

import notafiscal.*;
import orcamentos.Item;

public class TesteNotaFiscal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.addAcao(new EnvioEmail());
        
        builder.addAcao(new EnvioImpressora());

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                          .comCnpj("123.456.789/0001-10")
                          .comItem(new Item("item 1", 100.0))
                          .comItem(new Item("item 2", 200.0))
                          .comItem(new Item("item 3", 300.0))
                          .comObservacoes("entregar notaFiscal pessoalmente")
                          .naDataAtual()
                          .builder();

	}

}
