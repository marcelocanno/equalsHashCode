package stackPilhas;

import java.util.Stack;

import equalsHashCode.Carro;

public class Main extends Carro {

	public Main(String marca) {
		super(marca);
	}

	public static void main(String[] args) {
		
		Stack<Carro>stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Fiat"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("Renault"));
		stackCarros.push(new Carro("Dodge"));
		
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.empty());
		
	}

}
