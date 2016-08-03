package Impostos;
public class ICC implements Imposto {

	@Override
	public double calcula(double valor) {
		if (valor < 1000)
			return valor*0.005;
		if (valor >= 1000 && valor <= 3000)
			return valor*0.007;
		return (valor*0.008) + 30;
	}

}
