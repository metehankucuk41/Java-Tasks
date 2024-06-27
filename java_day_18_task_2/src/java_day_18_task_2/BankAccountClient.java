package java_day_18_task_2;
import java.util.Scanner;

public class BankAccountClient {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BankAccount account1 = new BankAccount();
		account1.accountHolder = "Adam Smith";
		account1.accountNumber = 10025698745L;
		account1.balance = 2000;
		
		boolean control = true;
		while(control)
		{
			System.out.println("1) Display the current account balance.");
			System.out.println("2) Deposit money into the account.");
			System.out.println("3) Withdraw money from the account.");
			System.out.println("4) Purchase an item using the account.");
			System.out.println("5) Exit the program.");
			System.out.print("Please select the operation you would like to perform: ");
			String operation = scanner.nextLine();
			
			switch (operation)
			{
				case "1":
					account1.showBalance();
					break;
				case "2":
					System.out.print("Enter the amount to deposit: ");
					double eklenecek_miktar = scanner.nextDouble();
					account1.deposit(eklenecek_miktar);
					scanner.nextLine();
					break;
				case "3":
					System.out.print("Enter the amount to withdraw: ");
					double cekilecek_miktar = scanner.nextDouble();
					account1.withdraw(cekilecek_miktar);
					scanner.nextLine();
					break;
				case "4":
					System.out.print("Enter the item you want to purchase: ");
					String item = scanner.nextLine();
					System.out.print(" Enter the price for " + item + "($): ");
					double price = scanner.nextDouble();
					account1.charge(item, price);
					scanner.nextLine();
					break;
				case "5":
					control = false;
					break;
				default:
					System.out.println("Please enter a valid operation.");
					break;
			}
			System.out.println();
		}
		scanner.close();
	}

}
