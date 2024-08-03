package java_day_23_task_2;
import java.util.Scanner;

public class Java_day_23_task_2 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = scanner.nextLine();
		
		Reverse(word);
		
		scanner.close();

	}
	
	/**
	 * Reverses the given word and prints it to the console.
	 * 
	 * @param word The word to be reversed.
	 */
	public static void Reverse(String word)
	{
		for (int i = word.length()-1; i >= 0; i--)
		{
			System.out.print(word.charAt(i));
		}
	}

}
