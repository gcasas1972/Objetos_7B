package objetos;

public class Resistor extends Componente {

	public Resistor() {
		super();
	}

	public Resistor(String nombre, String simbolo, double valor, String unidad) {
		super(nombre, simbolo, valor, unidad);
	}

	@Override
	public double calcularModulo(double pFcia) {		
		return this.getValor();
	}

}
