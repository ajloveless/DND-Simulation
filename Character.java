import Races.*;

public class Character
{
	//Dwarf, Elf, Gnome, Half-Elf, Hafling, Half-Orc, Human, Tiefling
	String firstName, lastName, alignment;
	boolean gender = true; //True for male, false for female
	Dwarf test = new Dwarf();
	public Character()
	{
		this.alignment = generateAlignment();
		this.firstName = test.nameGen(gender,"first");
		this.lastName = test.nameGen(gender,"last");

	}

	public String generateAlignment()
	{
		int axesNum = (int) (Math.random() * 3); //Lawful, Neutral, Chaotic
		int moralityNum = (int) (Math.random() * 3); //Good, Neutral, Evil

		String[] axes = {"Lawful", "Neutral", "Chaotic"};
		String[] morality = {"Good","Neutral","Evil"};

		if (axesNum == 1 && moralityNum == 1) return "True Neutral";
		else return axes[axesNum] + " " + morality[moralityNum];
	}


	public String generatePrefix()
	{
		return gender ? "Mr." : "Mrs.";
	}
}