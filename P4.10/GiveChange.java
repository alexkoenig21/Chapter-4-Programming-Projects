public class change
{
	public static void main(String[] args)
	{
	Scanner myScanner = new Scanner(System.in);
	System.out.println("Total Price of Items Is: ");
	double total = myScanner.nextDouble();
	System.out.println("You paid: ");
	double paid = myScanner.nextDouble();
	int cent = (int) ((int) (paid * 100) - (total * 100));
	int quarters = cent / 25;
	cent -= quarters * 25;
	int dimes = cent / 10;
	cent -= dimes * 10;
	int nickels = cent / 5;
	cent -= nickels * 5;
	int pennies = cent / 1;
	System.out.println("Your Change is: ");
	System.out.println(quarters + " quarters" + dimes + " dimes" + nickels + " nickels" + pennies + " pennies");

	}
}
