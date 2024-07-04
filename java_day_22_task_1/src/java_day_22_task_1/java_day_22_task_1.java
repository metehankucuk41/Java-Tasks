package java_day_22_task_1;
import java.util.Scanner;

public class java_day_22_task_1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		while(true)
		{
			System.out.print("Please enter a number: ");
			int number =  scanner.nextInt();
			
			if (number < 0)
			{
				break;
			}
			else
			{
				total += number;
			}
		}
		System.out.println("Sum of numbers: " + total);
		scanner.close();

	}

}
