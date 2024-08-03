package java_day_23_task_4;
import java.util.Scanner;

public class Java_day_23_task_4 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a word: ");
		String word = scanner.nextLine();
		
		System.out.print("The number of vowels in the word you entered: " + valuesOfConsonants(word));
		
		scanner.close();
	}
	
	/**
	 * Counts the number of consonants in the given word.
	 *
	 * @param word The word to be checked for consonants.
	 * @return The number of consonants in the word.
	 */
	public static int valuesOfConsonants(String word)
	{
		int vowelsLength = 0;
		
		for (int i = 0; i < word.length(); i++)
		{
			if (isLetter(word.charAt(i)) && isConsonant(word.charAt(i)))
			{
				vowelsLength++;
			}
		}
		
		return vowelsLength;
	}
	
	/**
	 * Checks if the given character is a consonant.
	 *
	 * @param character The character to be checked.
	 * @return {@code true} if the character is a consonant, {@code false} otherwise.
	 */
	public static boolean isConsonant(char character)
	{
		switch (character)
		{
			case 'a','e','i','o','u':
				return false;
			default:
				return true;
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
