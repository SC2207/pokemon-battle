import java.util.Scanner;

public class MainClass {
	
	public static void clearScreen()
	{
		for(int i = 0; i <= 12; i++)
		{
			//System.out.println();
		}
	}

	public static void main(String[] args) {
		PokemonClass Pokemon = new PokemonClass(null, 0, 0, null, null, 0, 0, false, null, null);
		Scanner scannerObj = new Scanner(System.in);
		String tempString;
		String trainerOneNameInput;
		String trainerTwoNameInput;
		int pokemonSelectionOne;
		int pokemonSelectionTwo;
		int pokemonSelectionThree;
		String blankSpace;
		
		
		System.out.println("Welcome to the pokemon battle arena!");
		System.out.println("Challenger 1, enter your name now:");
		trainerOneNameInput = scannerObj.nextLine();
		clearScreen();
		
		System.out.println("Challenger 2, enter your name now:");
		trainerTwoNameInput = scannerObj.nextLine();
		clearScreen();
		blankSpace = scannerObj.nextLine();
		
		Trainer TrainerOne = new Trainer(trainerOneNameInput);
		Trainer TrainerTwo = new Trainer(trainerTwoNameInput);
		
		System.out.println(TrainerOne.getName() + " Will be facing off against " + TrainerTwo.getName());
		System.out.println(TrainerOne.getName() + " You may now choose your 3 Pokemon!");
		blankSpace = scannerObj.nextLine();
		
		Pokemon.getPokemonList();
		System.out.println("Enter a Pokemon Number:");
		tempString = scannerObj.nextLine();
		pokemonSelectionOne = Integer.parseInt(tempString);
		if(pokemonSelectionOne == pokemonSelectionOne)
		{
			if(pokemonSelectionOne == 1)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 2)
			{
				Sandshrew FighterTwo = new Sandshrew(TrainerOne.getName(), 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
			}
			if(pokemonSelectionOne == 3)
			{
				Pidgey FighterThree = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 4)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(),100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 5)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 6)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 7)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 8)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 9)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 10)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 11)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 12)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			else
			{
			System.out.println("Not a valid selection input.");
			}
		}
		System.out.println("Enter a Pokemon Number:");
		tempString = scannerObj.nextLine();
		pokemonSelectionTwo = Integer.parseInt(tempString);
		if(pokemonSelectionTwo == pokemonSelectionTwo)
		{
			if(pokemonSelectionTwo == 1)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 2)
			{
				Sandshrew FighterTwo = new Sandshrew(TrainerOne.getName(), 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
			}
			if(pokemonSelectionTwo == 3)
			{
				Pidgey FighterThree = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 4)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(),100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 5)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 6)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 7)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 8)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 9)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 10)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 11)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 12)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			else
			{
			System.out.println("Not a valid selection input.");
			}
		}
		System.out.println("Enter a Pokemon Number:");
		tempString = scannerObj.nextLine();
		pokemonSelectionThree = Integer.parseInt(tempString);
		if(pokemonSelectionThree == pokemonSelectionThree)
		{
			if(pokemonSelectionThree == 1)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 2)
			{
				Sandshrew FighterTwo = new Sandshrew(TrainerOne.getName(), 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
			}
			if(pokemonSelectionThree == 3)
			{
				Pidgey FighterThree = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 4)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(),100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 5)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 6)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 7)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 8)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 9)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 10)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 11)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 12)
			{
				Pidgey FighterOne = new Pidgey(TrainerOne.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			else
			{
			System.out.println("Not a valid selection input.");
			}
		}
		//TrainerOne.pokemonSelection(pokemonSelectionOne, pokemonSelectionTwo, pokemonSelectionThree);
		
		System.out.println(TrainerTwo.getName() + " You may now choose your 3 Pokemon!");
		blankSpace = scannerObj.nextLine();
		
		Pokemon.getPokemonList();
		System.out.println("Enter a Pokemon Number:");
		tempString = scannerObj.nextLine();
		pokemonSelectionOne = Integer.parseInt(tempString);
		if(pokemonSelectionOne == pokemonSelectionOne)
		{
			if(pokemonSelectionOne == 1)
			{
				Pidgey FighterFour = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 2)
			{
				Sandshrew FighterFive = new Sandshrew(TrainerTwo.getName(), 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
			}
			if(pokemonSelectionOne == 3)
			{
				Pidgey FighterSix = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 4)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(),100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 5)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 6)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 7)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 8)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 9)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 10)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 11)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionOne == 12)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			else
			{
			System.out.println("Not a valid selection input.");
			}
		}
		System.out.println("Enter a Pokemon Number:");
		tempString = scannerObj.nextLine();
		pokemonSelectionTwo = Integer.parseInt(tempString);
		if(pokemonSelectionTwo == pokemonSelectionTwo)
		{
			if(pokemonSelectionTwo == 1)
			{
				Pidgey FighterFour = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 2)
			{
				Sandshrew FighterFive = new Sandshrew(TrainerTwo.getName(), 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
			}
			if(pokemonSelectionTwo == 3)
			{
				Pidgey FighterSix = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 4)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(),100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 5)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 6)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 7)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 8)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 9)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 10)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 11)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionTwo == 12)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			else
			{
			System.out.println("Not a valid selection input.");
			}
		}
		System.out.println("Enter a Pokemon Number:");
		tempString = scannerObj.nextLine();
		pokemonSelectionThree = Integer.parseInt(tempString);
		if(pokemonSelectionThree == pokemonSelectionThree)
		{
			if(pokemonSelectionThree == 1)
			{
				Pidgey FighterFour = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 2)
			{
				Sandshrew FighterFive = new Sandshrew(TrainerTwo.getName(), 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
			}
			if(pokemonSelectionThree == 3)
			{
				Pidgey FighterSix = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 4)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(),100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 5)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 6)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 7)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 8)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 9)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 10)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 11)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			if(pokemonSelectionThree == 12)
			{
				Pidgey FighterOne = new Pidgey(TrainerTwo.getName(), 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
			}
			else
			{
			System.out.println("Not a valid selection input.");
			}
		}
		
		
		
		
		//System.out.println(TrainerOne.getName() + " Pokemon selection is: " + FighterOne + ", " + FighterTwo + ", " + FighterThree + "!");
		//System.out.println(TrainerTwo.getName() + " Pokemon selection is: " + FighterOne + ", " + FighterTwo + ", " + FighterThree + "!");
		
		/*Pidgey FighterOne = new Pidgey(trainerOneNameInput, 100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "");	
		Sandshrew FighterTwo = new Sandshrew(trainerTwoNameInput, 100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "");
		FighterOne.getPokemonId();
		
		System.out.println();
		
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
				*/
				
		
	}
}
