
public class CalculadorDeImposto {
	public void calculaImposto(Orcamento orc, Imposto imp){
		double taxa = imp.calcula(orc.getValor());
		System.out.println(taxa);
	}
}
