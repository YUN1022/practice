package hwAbstract;

public abstract class Pokemon {
	private final String name;
	private final PokemonType type;
	private int CP;
	
	public Pokemon(String name,PokemonType type,int CP){
		this.name=name;
		this.type=type;
		this.CP=CP;
	}
	
	public String getName(){
		return name;
	}
	public PokemonType getType(){
		return type;
	}
	public int getCP(){
		return CP;
	}
	public void setCP(int CP){
		this.CP=CP;
	}
	public abstract void attack();
}
