class Bulbasaur extends PokemonClass {
	public Bulbasaur(String TrainerName, int Health, int PokemonId, String AttackOneName, String AttackTwoName, int AttackOnePower, int AttackTwoPower, boolean IsAlive, String Name, String Type) {
		super(TrainerName, Health, PokemonId, AttackOneName, AttackTwoName, AttackOnePower, AttackTwoPower, IsAlive, Name, Type);
		type = "grass";
	}
}