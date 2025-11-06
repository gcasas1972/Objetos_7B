package objetos;

public class Inductor extends Componente {

	public Inductor() {
		super();		
	}

	public Inductor(String nombre, String simbolo, double valor, String unidad) {
		super(nombre, simbolo, valor, unidad);		
	}

	@Override
	public double calcularModulo(double pFcia) {
		return 2*Math.PI* this.getValor()*pFcia;
	}

}
