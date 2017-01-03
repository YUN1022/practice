package hwoop;

public class Pokemon {
		private final String name;
		private  int CP;
		
		public Pokemon(String name,int CP){
			this.name=name;
			this.CP=CP;
		}
		
		public String getname(){
			return name;
		}
		public int getCP(){
			return CP;
		}
		public void setCP(int CP){
			this.CP=CP;
		}

}
