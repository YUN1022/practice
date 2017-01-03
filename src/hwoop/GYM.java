package hwoop;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2){
		int winner;
		
		winner=(int)Math.random()*2;
		
		if(winner==0){
			System.out.printf("%s",p1.getname());
			p1.setCP(p1.getCP()+500);
		}
		else{
			System.out.printf("%s",p2.getname());
			p2.setCP(p2.getCP()+500);
		}
	}
}
