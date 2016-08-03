
package Impostos;

import orcamentos.Orcamento;

public class ISS extends Imposto {
	
	public ISS(){}
	
	public ISS(Imposto impostoComposto){
		super.impostoComposto = impostoComposto;
	}

	@Override
	public double calcula(Orcamento orc) {
		// TODO Auto-generated method stub
		return (orc.getValor()*0.006) + 50 + calculaImpostoComposto(orc);
	}


}
