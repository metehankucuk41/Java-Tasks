package java_day_31_task_1;
import java.util.Scanner;

public class Java_day_31_task_1 
{
	
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int numOfElements = scanner.nextInt();
		
		int[] array = new int[numOfElements];
		
		for(int i = 0; i < numOfElements; i++)
		{
			System.out.print("Enter number " + (i+1) + ": ");
			int number = scanner.nextInt();
			array[i] = number;
		}
		
		System.out.println("The average is: " + averageOfArray(array));
		
		scanner.close();
	}
	
	/**
	 * Calculates the average of the elements in the given array.
	 * 
	 * @param array The array containing the elements.
	 * @return The average of the elements in the array.
	 */
	public static double averageOfArray(int[] array)
	{
		int sum = 0;
		double average;
		
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		average = sum / array.length;
		return average;
	}

}
