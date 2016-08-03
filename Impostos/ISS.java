
package Impostos;

import orcamentos.Orcamento;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orc) {
		// TODO Auto-generated method stub
		return (orc.getValor()*0.006) + 50;
	}


}
