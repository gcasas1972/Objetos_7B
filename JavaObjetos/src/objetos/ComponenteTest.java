package objetos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComponenteTest {

	public static void main(String[] args) {
		Componente r1 = new Resistor("R1","R",50,"ohm");
		Componente r2 = new Resistor("R2","R",50,"ohm");
		
		Componente i1 = new Inductor("L1","L",100,"Hy");
		Componente i2 = new Inductor("L2","L",100,"Hy");
		
		Componente c1 = new Capacitor("C1","c",100,"Faradio");
		
		List listaDeComponentes = new ArrayList<Componente>();
		listaDeComponentes.add(r1);
		listaDeComponentes.add(r2);
		
		listaDeComponentes.add(i1);
		listaDeComponentes.add(i2);
		listaDeComponentes.add(c1);
		
		Set setComp = new HashSet<Componente>();
		
		setComp.add(r1);
		setComp.add(r2);
		setComp.add(i1);
		setComp.add(i2);
		setComp.add(c1);
		
		
		System.out.println("Lista de componentes tipo List");
		System.out.println(listaDeComponentes);
		System.out.println();
		System.out.println("lista de componentes tipo Set");
		System.out.println(setComp);
	}

}
