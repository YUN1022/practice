package hwAbstract;

public class Psyduck extends Pokemon {
	
	public Psyduck(String name,PokemonType type,int CP){
		super(name,type,CP);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Aqua Tail");
	}

}
