package objetos;

import java.util.ArrayList;
import java.util.List;

public class ComponenteTest {

	public static void main(String[] args) {
		Componente r1 = new Resistor("R1","R",50,"ohm");
		Componente i1 = new Inductor("L1","L",100,"Hy");
		Componente c1 = new Capacitor("C1","c",100,"Faradio");
		
		List listaDeComponentes = new ArrayList<Componente>();
		listaDeComponentes.add(r1);
		listaDeComponentes.add(i1);
		listaDeComponentes.add(c1);
		
		//for (Componente comp : listaDeComponentes)
		
		System.out.println("El resitor cuyo nombre es" + r1.getNombre());
		System.out.println("El resitor tiene un modulo de " + r1.calcularModulo(100));
		
		System.out.println("El inductor cuyo nombre es" + i1.getNombre());
		System.out.println("El inductor tiene un modulo de " + i1.calcularModulo(100));

		System.out.println("El Capacitor cuyo nombre es" + c1.getNombre());
		System.out.println("El Capacitor tiene un modulo de " + c1.calcularModulo(100));

	}

}
