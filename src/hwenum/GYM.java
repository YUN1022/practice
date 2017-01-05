package hwenum;

import java.util.Random;	
public class GYM {

	public static Player fight(Player...players){
		Random rand=new Random();
		
		Pokemon[] p1=players[0].getPokemons();
		Pokemon[] p2=players[1].getPokemons();
		
		int count1=0,count2=0,randwin;
		for(int i=0;i<3;i++){
			if(p1[i].getType()==PokemonType.FIRE){
				if(p2[i].getType()==PokemonType.GRASS){
					count1++;
				}
				else if(p2[i].getType()==PokemonType.WATER){
					count2++;
				}
				else{
					if(p1[i].getCp()>p2[i].getCp()){
						count1++;
					}
					else if(p1[i].getCp()<p2[i].getCp()){
						count2++;
					}
					else{
						randwin=rand.nextInt(2);
						if(randwin==0){
							count1++;
						}
						else{
							count2++;
						}
					}
				}
			}
			
			else if(p1[i].getType()==PokemonType.GRASS){
				if(p2[i].getType()==PokemonType.FIRE){
					count2++;
				}
				else if(p2[i].getType()==PokemonType.WATER){
					count1++;
				}
				else{
					if(p1[i].getCp()>p2[i].getCp()){
						count1++;
					}
					else if(p1[i].getCp()<p2[i].getCp()){
						count2++;
					}
					else{
						randwin=rand.nextInt(2);
						if(randwin==0){
							count1++;
						}
						else{
							count2++;
						}
					}
				}
			}
			
			else if(p1[i].getType()==PokemonType.WATER){
				if(p2[i].getType()==PokemonType.FIRE){
					count1++;
				}
				else if(p2[i].getType()==PokemonType.GRASS){
					count2++;
				}
				else{
					if(p1[i].getCp()>p2[i].getCp()){
						count1++;
					}
					else if(p1[i].getCp()<p2[i].getCp()){
						count2++;
					}
					else{
						randwin=rand.nextInt(2);
						if(randwin==0){
							count1++;
						}
						else{
							count2++;
						}
					}
				}
			}
			if(count1==2){
				break;
			}
			else if(count2==2){
				break;
			}
		}
		
		if(count1>count2){
			System.out.printf("Winner is %s,and his/her level becomes %d",players[0].getPlayerName(),players[0].getLevel()+1);
			players[0].setLevel(players[0].getLevel()+1);
			return players[0];
		}
		else{
			System.out.printf("Winner is %s,and his/her level becomes %d",players[1].getPlayerName(),players[1].getLevel()+1);
			players[1].setLevel(players[1].getLevel()+1);
			return players[1];
		}
	}
}
