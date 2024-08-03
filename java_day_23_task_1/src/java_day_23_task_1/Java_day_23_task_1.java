package java_day_23_task_1;
import java.util.Scanner;

public class Java_day_23_task_1 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your firstname: ");
		String ad = scanner.nextLine();
		
		System.out.print("Please enter your lastname: ");
		String soyad = scanner.nextLine();
		
		System.out.println("Total number of characters in your first and last name: " + (ad.length()+soyad.length()));
		
		scanner.close();
		

	}

}
