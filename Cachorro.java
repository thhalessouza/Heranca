package exercíciosherança;

public class Cachorro extends Animal implements InterfaceAnimal {

	
	public void somEmitido() {
		System.out.println("Latindo: AuAuAu");
	}
	
	public void correr() {
		System.out.println("Cachorro correndo..");
	}

	@Override
	public void comendo() {
		System.out.println("Cachorro comendo ração...");
		
	}
	
	
	}
