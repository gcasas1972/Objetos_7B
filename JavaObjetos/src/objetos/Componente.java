package objetos;

public class Componente {
	private String nombre;
	private String simbolo;
	private double valor;
	private String unidad;
	public Componente() {
		super();
	}
	public Componente(String nombre, String simbolo, double valor, String unidad) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.valor = valor;
		this.unidad = unidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	
	
	

}
