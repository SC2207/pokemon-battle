class Caterpie extends PokemonClass {
	public Caterpie(String TrainerName, int Health, int PokemonId, String AttackOneName, int AttackOnePower, boolean IsAlive, String Name, String Type) {
		super(TrainerName, Health, PokemonId, AttackOneName, AttackOnePower, IsAlive, Name, Type);
		type = "bug";
	}
}