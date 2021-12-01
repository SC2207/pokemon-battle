
public class MainClass {
	float multiplier = 1.0f;

	public static void main(String[] args) {
		MainClass main = new MainClass();
		Pidgey FighterOne = new Pidgey(100, 16, "tackle", "gust", 40, 40, true, "Pidgey", "flying");
		Sandshrew FighterTwo = new Sandshrew(100, 27, "scratch", "rollout", 40, 30, true, "Sandshrew", "ground");
		FighterOne.getPokemonId();

		// Battle phase
		main.typeMatchUp(FighterOne.getType(), FighterTwo.getType());

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

	public void effectiveAttack(float multiplier) {
		if (multiplier == 1.5f) {
			System.out.println("It's super effective!");
		} else if (multiplier == 0.5f) {
			System.out.println("It's not very effective.");
		} else if (multiplier == 0.0f) {
			System.out.println("It had no effect.");
		} else {

		}
	}

	public void typeMatchUp(String type1, String type2) {
		// normal
		if (type1 == "ghost" && type2 == "normal") {
			multiplier = 0.0f;
		}

		// ghost
		if (type1 == "ghost" && type2 == "ghost") {
			multiplier = 1.5f;
		}

		if (type1 == "poison" && type2 == "ghost") {
			multiplier = 0.5f;
		}

		if (type1 == "bug" && type2 == "ghost") {
			multiplier = 0.5f;
		}

		// fire
		if (type1 == "water" && type2 == "fire") {
			multiplier = 1.5f;
		}

		if (type1 == "rock" && type2 == "fire") {
			multiplier = 1.5f;
		}

		if (type1 == "ground" && type2 == "fire") {
			multiplier = 1.5f;
		}

		if (type1 == "grass" && type2 == "fire") {
			multiplier = 0.5f;
		}

		if (type1 == "fire" && type2 == "fire") {
			multiplier = 0.5f;
		}

		// water
		if (type1 == "grass" && type2 == "water") {
			multiplier = 1.5f;
		}

		if (type1 == "electric" && type2 == "water") {
			multiplier = 1.5f;
		}

		if (type1 == "fire" && type2 == "water") {
			multiplier = 0.5f;
		}

		if (type1 == "water" && type2 == "water") {
			multiplier = 0.5f;
		}

		// grass
		if (type1 == "fire" && type2 == "grass") {
			multiplier = 1.5f;
		}

		if (type1 == "poison" && type2 == "grass") {
			multiplier = 1.5f;
		}

		if (type1 == "flying" && type2 == "grass") {
			multiplier = 1.5f;
		}

		if (type1 == "bug" && type2 == "grass") {
			multiplier = 1.5f;
		}

		if (type1 == "water" && type2 == "grass") {
			multiplier = 0.5f;
		}

		if (type1 == "grass" && type2 == "grass") {
			multiplier = 0.5f;
		}

		if (type1 == "electric" && type2 == "grass") {
			multiplier = 0.5f;
		}

		if (type1 == "ground" && type2 == "grass") {
			multiplier = 0.5f;
		}

		// electric
		if (type1 == "ground" && type2 == "electric") {
			multiplier = 1.5f;
		}

		if (type1 == "electric" && type2 == "electric") {
			multiplier = 0.5f;
		}

		if (type1 == "flying" && type2 == "electric") {
			multiplier = 0.5f;
		}

		// poison
		if (type1 == "ground" && type2 == "poison") {
			multiplier = 1.5f;
		}

		if (type1 == "psychic" && type2 == "poison") {
			multiplier = 1.5f;
		}

		if (type1 == "grass" && type2 == "poison") {
			multiplier = 0.5f;
		}

		if (type1 == "poison" && type2 == "poison") {
			multiplier = 0.5f;
		}

		if (type1 == "bug" && type2 == "poison") {
			multiplier = 0.5f;
		}

		// ground

		if (type1 == "water" && type2 == "ground") {
			multiplier = 1.5f;
		}

		if (type1 == "grass" && type2 == "ground") {
			multiplier = 1.5f;
		}

		if (type1 == "poison" && type2 == "ground") {
			multiplier = 0.5f;
		}

		if (type1 == "rock" && type2 == "ground") {
			multiplier = 0.5f;
		}

		if (type1 == "electric" && type2 == "ground") {
			multiplier = 0.0f;
		}

		// flying

		if (type1 == "electric" && type2 == "flying") {
			multiplier = 1.5f;
		}

		if (type1 == "rock" && type2 == "flying") {
			multiplier = 1.5f;
		}

		if (type1 == "grass" && type2 == "flying") {
			multiplier = 0.5f;
		}

		if (type1 == "bug" && type2 == "flying") {
			multiplier = 0.5f;
		}

		if (type1 == "ground" && type2 == "flying") {
			multiplier = 0.0f;
		}

		// psychic
		if (type1 == "bug" && type2 == "psychic") {
			multiplier = 1.5f;
		}

		if (type1 == "ghost" && type2 == "psychic") {
			multiplier = 1.5f;
		}

		if (type1 == "psychic" && type2 == "psychic") {
			multiplier = 0.5f;
		}

		// bug
		if (type1 == "fire" && type2 == "bug") {
			multiplier = 1.5f;
		}

		if (type1 == "flying" && type2 == "bug") {
			multiplier = 1.5f;
		}

		if (type1 == "rock" && type2 == "bug") {
			multiplier = 1.5f;
		}

		if (type1 == "grass" && type2 == "bug") {
			multiplier = 0.5f;
		}

		if (type1 == "ground" && type2 == "bug") {
			multiplier = 0.5f;
		}

		// rock
		if (type1 == "water" && type2 == "rock") {
			multiplier = 1.5f;
		}

		if (type1 == "grass" && type2 == "rock") {
			multiplier = 1.5f;
		}

		if (type1 == "ground" && type2 == "rock") {
			multiplier = 1.5f;
		}

		if (type1 == "normal" && type2 == "rock") {
			multiplier = 0.5f;
		}

		if (type1 == "fire" && type2 == "rock") {
			multiplier = 0.5f;
		}

		if (type1 == "poison" && type2 == "rock") {
			multiplier = 0.5f;
		}

		if (type1 == "flying" && type2 == "rock") {
			multiplier = 0.5f;
		} else {
			multiplier = 1.0f;
		}
	}
}
