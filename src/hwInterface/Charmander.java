package hwInterface;

public class Charmander extends Pokemon {
	public Charmander(String name,PokemonType type,int CP){
		super(name,type,CP);
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Ember");
	}

}
