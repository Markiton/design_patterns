package Impostos;

import orcamentos.*;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orc) {
		// TODO Auto-generated method stub
		return orc.getValor()*0.005;
	}

}
