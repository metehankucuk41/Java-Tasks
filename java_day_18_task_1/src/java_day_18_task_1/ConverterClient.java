package java_day_18_task_1;
import java.util.Scanner;

public class ConverterClient 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		Converter converter = new Converter();
		boolean control = true;
		while(control)
		{
			System.out.println("1) Convert miles per hour (MPH) to kilometers per hour(KMH).");
			System.out.println("2) Convert kilometers per hour (KMH) to miles per hour (MPH).");
			System.out.println("3) Convert Fahrenheit to Celsius.");
			System.out.println("4) Convert Celsius to Fahrenheit.");
			System.out.println("5) Exit");
			System.out.print("Please select the operation you would like to perform: ");

			
			
			String operation = scanner.nextLine();
			switch (operation) 
			{
			    case "1":
			        System.out.print("Please enter a value in miles (double): ");
			        double miles = scanner.nextDouble();
			        System.out.println(miles + " miles: " + converter.convertMPHtoKM(miles) + " kilometers");
			        break;
			    case "2":
			        System.out.print("Please enter a value in kilometers (double): ");
			        double kilometers = scanner.nextDouble();
			        System.out.println(kilometers + " kilometers: " + converter.convertKMtoMPH(kilometers) + " miles");
			        break;
			    case "3":
			        System.out.print("Please enter a value in Fahrenheit (double): ");
			        double fahrenheit = scanner.nextDouble();
			        System.out.println(fahrenheit + " Fahrenheit: " + converter.convertFahrenheitToCelsius(fahrenheit));
			        break;
			    case "4":
			        System.out.print("Please enter a value in Celsius (double): ");
			        double celsius = scanner.nextDouble();
			        System.out.println(celsius + " Celsius: " + converter.convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
			        break;
			    case "5":
			        System.out.print("Exiting...");
			        control = false;
			        break;
			    default:
			        System.out.print("Please enter a valid option:");
			        break;
			}

			scanner.close();

		

		}

	}
}
