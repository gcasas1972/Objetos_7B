package objetos;

public class Capacitor extends Componente {

	public Capacitor() {
		super();
	}

	public Capacitor(String nombre, String simbolo, double valor, String unidad) {
		super(nombre, simbolo, valor, unidad);
	}

	@Override
	public double calcularModulo(double pFcia) {
		return 1/(2*Math.PI*this.getValor()*pFcia);
	}

}
