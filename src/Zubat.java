class Zubat extends PokemonClass {
	public Zubat(int Health, int PokemonId, String AttackOneName, String AttackTwoName, int AttackOnePower, int AttackTwoPower, boolean IsAlive, String Name, String Type) {
		super(Health, PokemonId, AttackOneName, AttackTwoName, AttackOnePower, AttackTwoPower, IsAlive, Name, Type);
		type = "poison";
	}
}