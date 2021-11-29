
public class MainClass {

	public static void main(String[] args) {
		Pidgey FighterOne = new Pidgey(100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		Sandshrew FighterTwo = new Sandshrew(100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
		FighterOne.getPokemonId();
		
		//Battle phase
		FighterTwo.health -= FighterOne.attack("tackle");
		FighterTwo.isPokemonAlive();
		
		
		FighterOne.health -= FighterTwo.attack("scratch");
		FighterOne.isPokemonAlive();
		
		
		FighterTwo.health -= FighterOne.attack("gust");
		FighterTwo.isPokemonAlive();
		
		
		FighterOne.health -= FighterTwo.attack("rollout");
		FighterOne.isPokemonAlive();
		
		
		FighterTwo.health -= FighterOne.attack("tackle");
		FighterTwo.isPokemonAlive();
				
				
		
	}

}
