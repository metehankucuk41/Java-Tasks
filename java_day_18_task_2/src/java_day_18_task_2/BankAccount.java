package java_day_18_task_2;
import java.util.Scanner;

public class BankAccount 
{
	public double balance;
	public String accountHolder;
	public long accountNumber;
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		

	}
	
	/**
	 * Deposits a specified amount into the bank account.
	 * 
	 * @param amount The amount to be deposited.
	 */
	public void deposit(double amount)
	{
		Scanner scanner = new Scanner(System.in);
		balance += amount;
		System.out.println("Depositing $" + amount + " to " + accountNumber);
		
	}
	
	/**
	 * Withdraws a specified amount from the bank account if sufficient funds are available.
	 * 
	 * @param amount The amount to be withdrawn.
	 */
	public void withdraw(double amount)
	{
		
		if ((balance-amount)<0)
		{
			System.out.println("Insufficients funds in " + accountNumber + "\n" + "Your balance is: "+balance);
		}
		else
		{
			balance -= amount;
			System.out.println("Withdrawing $" + amount + " to " + accountNumber);
		}
		
	}
	
	/**
	 * Displays the account holder's name, account number, and balance.
	 */
	public void showBalance()
	{
		System.out.println("Account Holder:\t" + accountHolder);
		System.out.println("Account Number:\t" + accountNumber);
		System.out.println("Balance:\t" + balance);
	}
	
	/**
	 * Charges a specified amount for a purchase if sufficient funds are available.
	 * 
	 * @param item The item to be purchased.
	 * @param price The price of the item.
	 */
	public void charge(String item, double price)
	{
		if ((balance-price)<0)
		{
			System.out.println("Insufficients funds for $" + price + " to purchase " + item + " from " + accountNumber);
		}
		
		else
		{
			System.out.println("Buying " + item + " for $" + price + " from " + accountNumber);
		}
	}
	
	
	
	

}
