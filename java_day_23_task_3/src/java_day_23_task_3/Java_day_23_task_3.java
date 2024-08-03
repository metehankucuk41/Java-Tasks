package java_day_23_task_3;
import java.util.Scanner;

public class Java_day_23_task_3 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = scanner.nextLine();
		
		System.out.print("The number of vowels in the word you entered: " + valuesOfVowels(word));
		
		scanner.close();
	}
	
	/**
	 * Counts the number of vowels in the given word.
	 * 
	 * @param word word The word to be checked for vowels.
	 * @return The number of vowels in the word.
	 */
	public static int valuesOfVowels(String word)
	{
		int vowelsLength = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			if (isLetter(word.charAt(i)) && isVowel(word.charAt(i)))
			{
				vowelsLength++;
			}
		}
		
		return vowelsLength;
	}
	
	/**
	 * Checks if the given character is a vowel.
	 * 
	 * @param character character The character to be checked.
	 * @return {@code true} if the character is a vowel, {@code false} otherwise.
	 */
	public static boolean isVowel(char character)
	{
		switch (character)
		{
			case 'a','e','i','o','u':
				return true;
			default:
				return false;
		}
	}
	
	/**
	 * Checks if the given character is a letter.
	 * 
	 * @param character The character to be checked.
	 * @return {@code true} if the character is a letter, {@code false} otherwise.
	 */
	public static boolean isLetter(char character)
	{
		if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'))
		{
			return true;
		}
		return false;
	}

}
