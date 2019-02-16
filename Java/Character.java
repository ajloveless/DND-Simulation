import Races.*;
import java.util.ArrayList; // import the ArrayList class


public class Character
{
	//Dwarf, Elf, Gnome, Half-Elf, Hafling, Half-Orc, Human, Tiefling
	String firstName, lastName, alignment;
	boolean gender = true; //True for male, false for female
	Race race; // Create an race object
	final int raceNumber = 2;


	public Character()
	{
		generateRace();
		this.alignment = generateAlignment();
		this.firstName = race.nameGen(gender,"first");
		this.lastName = race.nameGen(gender,"last");

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
			race = new Dwarf();
			break;

			case 1:
			race = new Elf();
			break;
		}
	}


}