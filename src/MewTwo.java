public class MewTwo {
	public String name;
	MewTwo(String name)
	{
		this.name = name;
	}
	public MewTwo returnObject()
	{
		MewTwo jacob = new MewTwo(this.name);
		return jacob;
	}
}
