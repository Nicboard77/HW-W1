
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice1 = 10.99;
		double itemPrice2 = 3.99;
		//These two lines of code are for setting the prices for two imaginary items, one being 10.99, and the other being 3.99
		double moneyInWallet1 = 147.23;
		double moneyInWallet2 = 32.47;
		//These two lines of code are for setting the amount of money in two different imaginary wallets, one being 147.23, and the other being 32.47
		double newMoneyInWallet1 = moneyInWallet1 - itemPrice1;
		double newMoneyInWallet2 = moneyInWallet2 - itemPrice2;
		//These two lines are setting up the variables for the 'transaction' to occur, so i can find the value of the new amount of money in my imaginary wallet
		double numberOfFriends1 = 23;
		double numberOfFriends2 = 34;
		//These two lines of code are for setting the number of imaginary friends that me and my girlfriend have, one being 23, the other being 34
		String firstName1 = "Nic ";
		String firstName2 = "Rhionna ";
		//These two lines are setting the first names, being Nic and Rhionna
		String lastName1 = "Board";
		String lastName2 = "Tiley";
		//These two lines are setting the last names, being Board and tiley.
		char middleInitial1 = 'J';
		char middleInitial2 = 'R';
		//These two lines are setting the middle initials, being J and R;
		int age1 = 17;
		int age2 = 18;
		//These two lines are setting the ages, being 17 and 18
		double friendsPerYear1 = numberOfFriends1 / age1;
		double friendsPerYear2 = numberOfFriends2 / age2;
		//These two lines perform division on numberOfFriends and age to determine how many friends per year
		String fullName1 = firstName1 + middleInitial1 + " " + lastName1;
		String fullName2 = firstName2 + middleInitial2 + " " + lastName2;
		//These two lines combine the first, middle, and last names to get a full name.
		
		
		System.out.println("I have $" + moneyInWallet1 + " in my wallet, before buying something.");
		System.out.println("My girlfriend has $" + moneyInWallet2 + " in her wallet, before buying something.");
		System.out.println("After buying 1 item worth 10.99 I have $" + newMoneyInWallet1);
		System.out.println("After my girlfriend bought 1 item worth 3.99, she will have $"+ newMoneyInWallet2 );
		System.out.println("In my 17 years of living I have made around " + friendsPerYear1 + " friends a year.");
		System.out.println("In my girlfriends 18 years of living, she will have made around " + friendsPerYear2 + " friends a year" );
		System.out.println("My full name is " + fullName1  );
		System.out.println("My girlfriends full name is " + fullName2);
		//These lines are for printing all of the information out into a way that us humans can understand easily 
		
	}

}