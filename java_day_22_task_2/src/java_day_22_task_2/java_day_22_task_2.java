package java_day_22_task_2;
import java.util.Random;
import java.util.Scanner;

public class java_day_22_task_2 
{

	public static void main(String[] args) 
	{
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		int targetNum = random.nextInt(1, 21);
		int guessedNum;
		do
		{
			System.out.print("Guess a number between 1 - 20: ");
			guessedNum = scanner.nextInt();
			if(guessedNum < targetNum)
			{
				System.out.println("Enter a larger number!");
			}
			else if(guessedNum > targetNum)
			{
				System.out.println("Enter a smaller number!");
			}
			else
			{
				System.out.println("Congratulations, you guessed the correct number.");
			}
		}while(guessedNum != targetNum);
		scanner.close();

	}

}
