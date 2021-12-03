import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//Variable initialisation
		PokemonClass Pokemon = new PokemonClass(null, 0, 0, null, 0, false, null, null);
		Scanner scannerObj = new Scanner(System.in);
		String trainerOneNameInput;
		String trainerTwoNameInput;
		String trainerOneConfirmInput;
		String trainerTwoConfirmInput;
		boolean trainerOneConfirmSelection = false;
		boolean trainerTwoConfirmSelection = false;
		String pokemonSelectionOne;
		String pokemonSelectionTwo;
		String pokemonSelectionThree;
		String blankSpace;
		
		//Creating an instance of all 12 pokemon
		Bulbasaur FighterOne = new Bulbasaur("", 50, 1, "vine whip", 45, true, "Bulbasaur", "");
		Charmander FighterTwo = new Charmander("", 70, 4, "ember", 40, true, "Charmander", "");
		Squirtle FighterThree = new Squirtle("", 70, 7, "watergun", 40, true, "Squirtle", "");
		Caterpie FighterFour = new Caterpie("", 70, 10, "bug bite", 45, true, "Caterpie", "");
		Pidgey FighterFive = new Pidgey("", 80, 16, "gust", 40, true, "Pidgey", "");
		Pikachu FighterSix = new Pikachu("", 60, 25, "thundershock", 40, true, "Pikachu", "");
		Sandshrew FighterSeven = new Sandshrew("", 70, 27, "bulldoze", 45, true, "Sandshrew", "");
		Zubat FighterEight = new Zubat("", 70, 41, "poison fang", 45, true, "Zubat", "");
		Geodude FighterNine = new Geodude("", 70, 74, "rock throw", 45, true, "Geodude", "");
		Gastly FighterTen = new Gastly("", 70, 92, "hex", 45, true, "Gastly", "");
		Drowzee FighterEleven = new Drowzee("", 70, 96, "confusion", 40, true, "Drowzee", "");
		Eevee FighterTwelve = new Eevee("", 70, 133, "tackle", 40, true, "Eevee", "");
		
		//Map of each selectable pokemon
		Map<String, PokemonClass> map = new HashMap<String, PokemonClass>();
		map.put(FighterOne.getName(), FighterOne);
		map.put(FighterTwo.getName(), FighterTwo);
		map.put(FighterThree.getName(), FighterThree);
		map.put(FighterFour.getName(), FighterFour);
		map.put(FighterFive.getName(), FighterFive);
		map.put(FighterSix.getName(), FighterSix);
		map.put(FighterSeven.getName(), FighterSeven);
		map.put(FighterEight.getName(), FighterEight);
		map.put(FighterNine.getName(), FighterNine);
		map.put(FighterTen.getName(), FighterTen);
		map.put(FighterEleven.getName(), FighterEleven);
		map.put(FighterTwelve.getName(), FighterTwelve);
		
		System.out.println("Welcome to the pokemon battle arena!");
		System.out.println("Challenger 1, enter your name now:");
		trainerOneNameInput = scannerObj.nextLine();
		//clearScreen();
		
		System.out.println("Challenger 2, enter your name now:");
		trainerTwoNameInput = scannerObj.nextLine();
		//clearScreen();
		System.out.println("Press 'Enter' to continue..");
		blankSpace = scannerObj.nextLine();
		
		Trainer TrainerOne = new Trainer(trainerOneNameInput);
		Trainer TrainerTwo = new Trainer(trainerTwoNameInput);
		
		System.out.println(TrainerOne.getName() + " will be facing off against " + TrainerTwo.getName());
		
		//Trainer 1 Pokemon Assignment
		while(trainerOneConfirmSelection != true)
		{
			System.out.println(TrainerOne.getName() + " you may now choose your 3 Pokemon!");
			System.out.println("Press 'Enter' to continue..");
			blankSpace = scannerObj.nextLine();
		
			Pokemon.getPokemonList();
			System.out.println("Enter your first Pokemon:");
			pokemonSelectionOne = scannerObj.nextLine();
		
			System.out.println("Enter your second Pokemon:");
			pokemonSelectionTwo = scannerObj.nextLine();
		
			System.out.println("Enter your third Pokemon:");
			pokemonSelectionThree = scannerObj.nextLine();
			
			System.out.println("You have chosen: " + pokemonSelectionOne + ", " + pokemonSelectionTwo + ", " + pokemonSelectionThree + " is this correct? (yes/no)");
			trainerOneConfirmInput = scannerObj.nextLine();
			if(trainerOneConfirmInput.equals("yes"))
			{
				trainerOneConfirmSelection = true;
				TrainerOne.pokemonSelection(map.get(pokemonSelectionOne), map.get(pokemonSelectionTwo), map.get(pokemonSelectionThree)); 
			}
		}
		
		//Trainer 2 Pokemon Assignment
		while(trainerTwoConfirmSelection != true)
		{
			System.out.println(TrainerTwo.getName() + " you may now choose your 3 Pokemon!");
			System.out.println("Press 'Enter' to continue..");
			blankSpace = scannerObj.nextLine();
		
			Pokemon.getPokemonList();
			System.out.println("Enter your first Pokemon:");
			pokemonSelectionOne = scannerObj.nextLine();
		
			System.out.println("Enter your second Pokemon:");
			pokemonSelectionTwo = scannerObj.nextLine();
		
			System.out.println("Enter your third Pokemon:");
			pokemonSelectionThree = scannerObj.nextLine();
		
			System.out.println("You have chosen: " + pokemonSelectionOne + ", " + pokemonSelectionTwo + ", " + pokemonSelectionThree + " is this correct? (yes/no)");
			trainerTwoConfirmInput = scannerObj.nextLine();
			if(trainerTwoConfirmInput.equals("yes"))
			{
				trainerTwoConfirmSelection = true;
				TrainerTwo.pokemonSelection(map.get(pokemonSelectionOne), map.get(pokemonSelectionTwo), map.get(pokemonSelectionThree));
			}
		}
		
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
