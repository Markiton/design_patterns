package Impostos;

public class TesteOrcamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento orc = new Orcamento(10000);
		Imposto ICC = new ICC();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.calculaImposto(orc, ICC);
	}

}
