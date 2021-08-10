package exercíciosherança;

public class Preguiça extends Animal implements InterfaceAnimal {
	
  public void somEmitido() {
	  System.out.println("Gritando: Ahhh Ahhh");
	}
  public void dormir() {
	  System.out.println("Dormindo: ZzzzZz");
  }
@Override
public void comendo() {
	System.out.println("Preguiça comendo folhas...");
	
}
}