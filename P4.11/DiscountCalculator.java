public class calculator
{
	public static void main(String args[]) 
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the number of movie rentals: ");
		int rental = myScanner.nextInt();
		System.out.println("Enter the number of members referred to the video club: ");
		int referral  = myScanner.nextInt();
		double discount = referral + rental; 
		System.out.println("The discount is equal to: " + Math.min(discount, 50.0) + "%.");

	}
	
}
