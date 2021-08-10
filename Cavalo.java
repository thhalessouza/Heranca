package exercíciosherança;

public class Cavalo extends Animal implements InterfaceAnimal {

	
	public void somEmitido() {
		System.out.println("Relinchando: Riiin");
	}
		
   public void correr() {
	   System.out.println("Cavalo correndo...");
   }

@Override
public void comendo() {
	System.out.println("Cavalo comendo palha... ");
	
}
		}

