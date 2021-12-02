
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
		System.out.println("Pidgey");
		System.out.println("Sandshrew");
		System.out.println("Pikachu");
		System.out.println("Bulbasaur");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
		System.out.println("Pidgey");
	}
	public boolean fight(PokemonClass that)
	{
		return(this.health >= that.health);
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