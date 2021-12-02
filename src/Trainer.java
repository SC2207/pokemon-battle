public class Trainer {
	String trainerName;
	PokemonClass pokemonOne;
	PokemonClass pokemonTwo;
	PokemonClass pokemonThree;
	PokemonClass pokemonCurrent;
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
	
	public void pokemonSelection(PokemonClass selectionOne, PokemonClass selectionTwo, PokemonClass selectionThree)
	{
		pokemonOne = selectionOne;
		pokemonTwo = selectionTwo;
		pokemonThree = selectionThree;
		pokemonCurrent = selectionOne;
	}
	public PokemonClass getCurrentPokemon()
	{
		return pokemonCurrent;
	}
	public void pokemonLost()
	{
		System.out.println("Your Pokemon has fainted.");
		if(pokemonCurrent.getName().equals(pokemonOne.getName()))
		{
			pokemonCurrent = pokemonTwo;
		}
		else if(pokemonCurrent.getName().equals(pokemonTwo.getName()))
		{
			pokemonCurrent = pokemonThree;
		}
		else if(pokemonCurrent.getName().equals(pokemonThree.getName()))
		{
			pokemonCurrent = null;
		}
	}
}

