
public class ISS implements Imposto {

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		return (valor*0.006) + 50;
	}

}
