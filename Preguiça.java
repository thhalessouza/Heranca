package exerc�ciosheran�a;

public class Pregui�a extends Animal implements InterfaceAnimal {
	
  public void somEmitido() {
	  System.out.println("Gritando: Ahhh Ahhh");
	}
  public void dormir() {
	  System.out.println("Dormindo: ZzzzZz");
  }
@Override
public void comendo() {
	System.out.println("Pregui�a comendo folhas...");
	
}
}