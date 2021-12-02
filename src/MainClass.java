import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Pidgey FighterOne = new Pidgey("", 80, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");
		Sandshrew FighterTwo = new Sandshrew("", 70, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
		Pikachu FighterThree = new Pikachu("", 60, 27, "scratch", "rollout", 40, 30, true, "Pikachu", "");
		Bulbasaur FighterFour = new Bulbasaur("", 50, 27, "scratch", "rollout", 40, 30, true, "Bulbasaur", "");
		
		
		
		
		
		
		
		
		Map<String, PokemonClass> map = new HashMap<String, PokemonClass>();
		map.put(FighterOne.getName(), FighterOne);
		map.put(FighterTwo.getName(), FighterTwo);
		map.put(FighterThree.getName(), FighterThree);
		map.put(FighterFour.getName(), FighterFour);
		
		PokemonClass Pokemon = new PokemonClass(null, 0, 0, null, null, 0, 0, false, null, null);
		Scanner scannerObj = new Scanner(System.in);
		String trainerOneNameInput;
		String trainerTwoNameInput;
		String pokemonSelectionOne;
		String pokemonSelectionTwo;
		String pokemonSelectionThree;
		String blankSpace;
		
		
		System.out.println("Welcome to the pokemon battle arena!");
		System.out.println("Challenger 1, enter your name now:");
		trainerOneNameInput = scannerObj.nextLine();
		//clearScreen();
		
		System.out.println("Challenger 2, enter your name now:");
		trainerTwoNameInput = scannerObj.nextLine();
		//clearScreen();
		blankSpace = scannerObj.nextLine();
		
		Trainer TrainerOne = new Trainer(trainerOneNameInput);
		Trainer TrainerTwo = new Trainer(trainerTwoNameInput);
		
		System.out.println(TrainerOne.getName() + " Will be facing off against " + TrainerTwo.getName());
		
		//Trainer 1 Pokemon Assignment
		System.out.println(TrainerOne.getName() + " You may now choose your 3 Pokemon!");
		blankSpace = scannerObj.nextLine();
		
		Pokemon.getPokemonList();
		System.out.println("Enter a Pokemon:");
		pokemonSelectionOne = scannerObj.nextLine();
		
		System.out.println("Enter a Pokemon:");
		pokemonSelectionTwo = scannerObj.nextLine();
		
		System.out.println("Enter a Pokemon:");
		pokemonSelectionThree = scannerObj.nextLine();
		
		TrainerOne.pokemonSelection(map.get(pokemonSelectionOne), map.get(pokemonSelectionTwo), map.get(pokemonSelectionThree)); 
		
		
		
		
		
		//Trainer 2 Pokemon Assignment
		System.out.println(TrainerTwo.getName() + " You may now choose your 3 Pokemon!");
		blankSpace = scannerObj.nextLine();
		
		Pokemon.getPokemonList();
		System.out.println("Enter a Pokemon:");
		pokemonSelectionOne = scannerObj.nextLine();
		
		System.out.println("Enter a Pokemon:");
		pokemonSelectionTwo = scannerObj.nextLine();
		
		System.out.println("Enter a Pokemon:");
		pokemonSelectionThree = scannerObj.nextLine();
		
		TrainerTwo.pokemonSelection(map.get(pokemonSelectionOne), map.get(pokemonSelectionTwo), map.get(pokemonSelectionThree)); 
		
		while(TrainerOne.getCurrentPokemon() != null && TrainerTwo.getCurrentPokemon() != null)
		{
			boolean result = TrainerOne.getCurrentPokemon().fight(TrainerTwo.getCurrentPokemon());
			if(result == true)
			{
				TrainerTwo.pokemonLost();
			}
			else
			{
				TrainerOne.pokemonLost();
			}
		}
		
		if(TrainerOne.getCurrentPokemon() != null)
		{
			System.out.println(TrainerOne.getName() + " wins the match!");
		}
		else
		{
			System.out.println(TrainerTwo.getName() + " wins the match!");
		}
	}
}
