
public class PokemonClass extends Trainer{
	int health;
	int pokemonId;
	String attackOneName;
	int attackOnePower;
	boolean isAlive;
	public String name;
	String type;
	public PokemonClass(String TrainerName, int Health, int PokemonId, String AttackOneName, int AttackOnePower, boolean IsAlive, String Name, String Type) {
		super(TrainerName);
		health = Health;
		pokemonId = PokemonId;
		attackOneName = AttackOneName;
		attackOnePower = AttackOnePower;
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
	public String getName()
	{
		return this.name;
	}
	public void getPokemonList()
	{
		System.out.println("Bulbasaur");
		System.out.println("Charmander");
		System.out.println("Squirtle");
		System.out.println("Caterpie");
		System.out.println("Pidgey");
		System.out.println("Pikachu");
		System.out.println("Sandshrew");
		System.out.println("Zubat");
		System.out.println("Geodude");
		System.out.println("Gastly");
		System.out.println("Drowzee");
		System.out.println("Eevee");
	}
	public boolean fight(PokemonClass that)
	{
		if(this.health >= that.health)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*public int attack(String attackName) {
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
	} */
}