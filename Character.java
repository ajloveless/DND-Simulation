import Races.*;
import java.util.ArrayList; // import the ArrayList class


public class Character
{
	//Dwarf, Elf, Gnome, Half-Elf, Hafling, Half-Orc, Human, Tiefling
	String firstName, lastName, alignment;
	boolean gender = true; //True for male, false for female
	ArrayList<Race> races = new ArrayList<Race>(); // Create an ArrayList object
	final int raceNumber = 2;


	public Character()
	{
		generateRace();
		this.alignment = generateAlignment();
		this.firstName = races.get(0).nameGen(gender,"first");
		this.lastName = races.get(0).nameGen(gender,"last");

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


	public void generateRace()
	{

		switch((int) (Math.random() * (raceNumber + 1)))
		{
			case 0:
			races.add(new Dwarf());
			break;

			case 1:
			races.add(new Elf());
			break;
		}
	}


}