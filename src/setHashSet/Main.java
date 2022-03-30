package setHashSet;

import java.util.HashSet;
import java.util.Set;

import equalsHashCode.Carro;

public class Main extends Carro {

	public Main(String marca) {
		super(marca);
	}

	public static void main(String[] args) {
		
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Renalt"));
		hashSetCarros.add(new Carro("Dodge"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(hashSetCarros);
	}

}
