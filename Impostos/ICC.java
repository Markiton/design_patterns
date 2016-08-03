package Impostos;

import orcamentos.*;

public class ICC implements Imposto {

	@Override
	public double calcula(Orcamento orc) {
		if (orc.getValor() < 1000)
			return orc.getValor()*0.005;
		if (orc.getValor() >= 1000 && orc.getValor() <= 3000)
			return orc.getValor()*0.007;
		return (orc.getValor()*0.008) + 30;
	}

}
