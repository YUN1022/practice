package hwInterface;

public abstract class Pokemon implements Fightable {
	
	private  String nickName;
	private final PokemonType type;
	private int CP;
	
	public Pokemon(String nickName,PokemonType type,int CP){
		this.nickName=nickName;
		this.CP=CP;
		this.type=type;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getCP() {
		return CP;
	}
	public void setCP(int CP) {
		this.CP = CP;
	}
	public PokemonType getTpye() {
		return type;
	}
	
	@Override
	public abstract void attack();
		// TODO Auto-generated method stub

	

}
