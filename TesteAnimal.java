package exerc�ciosheran�a;

public class TesteAnimal implements InterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Pregui�a laz = new Pregui�a();
		
		dog.setNome("Meg");
        dog.setIdade(10);
        
        horse.setNome("Debber");
        horse.setIdade(10);
        
        laz.setNome("Dora");
        laz.setIdade(20);
        
       
        
        System.out.println("Nome do Cachorro: " + dog.getNome());
        System.out.println("Idade do Cachorro: " + dog.getIdade());
        
        dog.somEmitido();
        dog.correr();
        dog.comendo();
		
        
        System.out.println("Nome do Cavalo: " + horse.getNome());
		System.out.println("Idade do Cavalo: " + horse.getIdade());
		
		horse.somEmitido();
		horse.correr();
		horse.comendo();
		
		
		System.out.println("Nome da Pregui�a: " + laz.getNome());
		System.out.println("Idade da Pregui�a: " + laz.getIdade());
		
		laz.somEmitido();
		laz.dormir();
		laz.comendo();
		
		
}

	@Override
	public void comendo() {
		
		
	}       
}
