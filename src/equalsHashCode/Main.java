package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Renalt"));
		listaCarros.add(new Carro("Dodge"));
		
		System.out.println(listaCarros.contains("Ford"));
		System.out.println(new Carro("Ford").hashCode());
		
		System.out.println("Ford".equals("Fiat"));
		
	
		
		
		

	}

}
