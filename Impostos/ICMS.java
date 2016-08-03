package Impostos;
public class ICMS implements Imposto {

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		return valor*0.005;
	}

}
