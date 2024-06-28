package java_day_18_task_1;

public class Converter 
{
    public static void main(String[] args) 
    {
        // Conversion methods can be tested here
    }
    
    /**
     * Converts a speed from miles per hour (MPH) to kilometers per hour (KMH).
     * 
     * @param input The speed in miles per hour (MPH).
     * @return The equivalent speed in kilometers per hour (KMH).
     */
    public static double convertMPHtoKM(double input)
    {
        return input * 1.609344;
    }
    
    /**
     * Converts a speed from miles per hour (MPH) to kilometers per hour (KMH).
     * 
     * @param input The speed in miles per hour (MPH).
     * @return The equivalent speed in kilometers per hour (KMH).
     */
    public static double convertMPHtoKM(int input)
    {
        return input * 1.609344;
    }
    
    /**
     * Converts a speed from kilometers per hour (KMH) to miles per hour (MPH).
     * 
     * @param input The speed in kilometers per hour (KMH).
     * @return The equivalent speed in miles per hour (MPH).
     */
    public static double convertKMtoMPH(double input)
    {
        return input / 1.609344;
    }
    
    /**
     * Converts a speed from kilometers per hour (KMH) to miles per hour (MPH).
     * 
     * @param input The speed in kilometers per hour (KMH).
     * @return The equivalent speed in miles per hour (MPH).
     */
    public static double convertKMtoMPH(int input)
    {
        return input / 1.609344;
    }
    
    /**
     * Converts a temperature from Celsius (°C) to Fahrenheit (°F).
     * 
     * @param input The temperature in degrees Celsius (°C).
     * @return The equivalent temperature in degrees Fahrenheit (°F).
     */
    public static double convertCelsiusToFahrenheit(double input)
    {
        return input * 1.8 + 32;
    }
    
    /**
     * Converts a temperature from Celsius (°C) to Fahrenheit (°F).
     * 
     * @param input The temperature in degrees Celsius (°C).
     * @return The equivalent temperature in degrees Fahrenheit (°F).
     */
    public static double convertCelsiusToFahrenheit(int input)
    {
        return input * 1.8 + 32;
    }
    
    /**
     * Converts a temperature from Fahrenheit (°F) to Celsius (°C).
     * 
     * @param input The temperature in degrees Fahrenheit (°F).
     * @return The equivalent temperature in degrees Celsius (°C).
     */
    public static double convertFahrenheitToCelsius(double input)
    {
        return (input - 32) / 1.8;
    }
    
    /**
     * Converts a temperature from Fahrenheit (°F) to Celsius (°C).
     * 
     * @param input The temperature in degrees Fahrenheit (°F).
     * @return The equivalent temperature in degrees Celsius (°C).
     */
    public static double convertFahrenheitToCelsius(int input)
    {
        return (input - 32) / 1.8;
    }
}
