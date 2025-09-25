package objetos;

public class Componente {
	//atributos
	private String nombre;
	private String simbolo;
	private double valor;
	private String unidad;
	
	//constructores
	public Componente() {
	}

	public Componente(String pNom, String pSim, double pValor, String pUni) {
		nombre	= pNom;
		simbolo = pSim;
		valor 	= pValor;
		unidad  = pUni;
	}
	//getter  y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String pNom) {
		nombre = pNom;
	}
	

}
