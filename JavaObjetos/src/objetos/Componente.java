package objetos;

public abstract class Componente {
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
	public abstract double calcularModulo(double pFcia);
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("/n/nnombre;");
		sb.append(this.getNombre());
		sb.append("/nsimbolo:");
		sb.append(this.getSimbolo());
		sb.append("/nvalor:");
		sb.append(this.getValor());
		sb.append("/nunidad:");
		sb.append(this.getUnidad());
		
		return sb.toString();
	}
	
	
	
	

}
