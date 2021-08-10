package exercíciosherança;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
	
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguiça laz = new Preguiça();
		
		
		dog.comendo();
		horse.comendo();
		laz.comendo();

	}

}
