class Geodude extends PokemonClass {
	public Geodude(String TrainerName, int Health, int PokemonId, String AttackOneName, int AttackOnePower, boolean IsAlive, String Name, String Type) {
		super(TrainerName, Health, PokemonId, AttackOneName, AttackOnePower, IsAlive, Name, Type);
		type = "rock";
	}
}