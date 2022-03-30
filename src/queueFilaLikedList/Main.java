package queueFilaLikedList;

import java.util.LinkedList;
import java.util.Queue;

import equalsHashCode.Carro;

public class Main extends Carro{

	public Main(String marca) {
		super(marca);
	}

	public static void main(String[] args) {
		
		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Fiat"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Renault"));
		queueCarros.add(new Carro("Dodge"));
		
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.add(new Carro("Pugeot")));
		System.out.println(queueCarros);
		
		
		System.out.println(queueCarros.offer(new Carro("Honda")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());
		
		
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.size());
		
		
		
		
		
		

	}

}
