package hwAbstract;

public class Bulbasaur extends Pokemon {
	public Bulbasaur(String name,PokemonType type,int CP){
		super(name,type,CP);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("Tackle\n");
	}

}
