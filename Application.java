public class Application
{

	public static void main(String[] args)
	{

		Character test = new Character();
		System.out.println("Hi, my name is " + test.firstName + " " + test.lastName + 
		", but you can just call me " +  test.generatePrefix() + " " + test.lastName + 
		". I am " + test.alignment + ".");

	}
}