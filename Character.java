public class Character
{
	//Dwarf, Elf, Gnome, Half-Elf, Hafling, Half-Orc, Human, Tiefling
	String firstName, lastName, alignment;
	public Character()
	{
		this.alignment = generateAlignment();
	}

	public static String generateAlignment()
	{
		int axesNum = (int) (Math.random() * 3); //Lawful, Neutral, Chaotic
		int moralityNum = (int) (Math.random() * 3); //Good, Neutral, Evil

		String[] axes = {"Lawful", "Neutral", "Chaotic"};
		String[] morality = {"Good","Neutral","Evil"};

		if (axesNum == 1 && moralityNum == 1) return "True Neutral";
		else return axes[axesNum] + " " + morality[moralityNum];
	}
}