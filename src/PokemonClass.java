
public class PokemonClass extends Trainer{
	int health;
	int pokemonId;
	String attackOneName;
	String attackTwoName;
	int attackOnePower;
	int attackTwoPower;
	boolean isAlive;
	String name;
	String type;
	public PokemonClass(String TrainerName, int Health, int PokemonId, String AttackOneName, String AttackTwoName, int AttackOnePower, int AttackTwoPower, boolean IsAlive, String Name, String Type) {
		super(TrainerName);
		health = Health;
		pokemonId = PokemonId;
		attackOneName = AttackOneName;
		attackTwoName = AttackTwoName;
		attackOnePower = AttackOnePower;
		attackTwoPower = AttackTwoPower;
		isAlive = IsAlive;
		name = Name;
		type = Type;
	}
	//Getters
	public void getPokemonId() {
		System.out.println("This pokemon id is #" + pokemonId);
	}
	public void getHealth()
	{
		System.out.println(name + "'s health is now " + health + ".");
	}
	public void getPokemonList()
	{
		System.out.println("1) Pidgey");
		System.out.println("2) Sandshrew");
		System.out.println("3) Pidgey");
		System.out.println("4) Pidgey");
		System.out.println("5) Pidgey");
		System.out.println("6) Pidgey");
		System.out.println("7) Pidgey");
		System.out.println("8) Pidgey");
		System.out.println("9) Pidgey");
		System.out.println("10) Pidgey");
		System.out.println("11) Pidgey");
		System.out.println("12) Pidgey");
	}
	
	public int attack(String attackName) {
		if(attackName == attackOneName)
		{
			System.out.println(name + " attacks the enemy pokemon with " + attackOneName + ".");
			return attackOnePower;
		}
		else if(attackName == attackTwoName)
		{
			System.out.println(name + " attacks the enemy pokemon with " + attackTwoName + ".");
			return attackTwoPower;
		}
		return 0;
	}
	public void isPokemonAlive() {
		if(health <= 0) {
			health = 0;
			getHealth();
			System.out.println(name + " has fainted!");
			isAlive = false;
		}
		else
		{
			getHealth();
		}
	}
}