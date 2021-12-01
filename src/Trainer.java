public class Trainer {
	String trainerName;
	public Trainer(String TrainerName)
	{
		trainerName = TrainerName;
	}
	
	public void setName(String nameGiven)
	{
		trainerName = nameGiven; 
	}
	public String getName()
	{
		return trainerName; 
	}
	
	public void pokemonSelection(int selectionOne, int selectionTwo, int selectionThree)
	{
		setPokemon(selectionOne);
		setPokemon(selectionTwo);
		setPokemon(selectionThree);
	}
	
	/*public void setPokemon(int selectionNumber)
	{
		if(selectionNumber == 1)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 2)
		{
			Sandshrew FighterTwo = new Sandshrew(trainerName, 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
		}
		if(selectionNumber == 3)
		{
			Pidgey FighterThree = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 4)
		{
			Pidgey FighterOne = new Pidgey(trainerName,100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 5)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 6)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 7)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 8)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 9)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 10)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 11)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		if(selectionNumber == 12)
		{
			Pidgey FighterOne = new Pidgey(trainerName, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		}
		else
		{
		System.out.println("Not a valid selection input.");
		}
	}
	*/
}

