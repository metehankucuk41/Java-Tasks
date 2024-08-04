package java_day_31_task_2;
import java.util.Random;

public class Java_day_31_task_2 
{

    public static void main(String[] args) 
    {
        
        Random random = new Random();
        int[] array = new int[random.nextInt(1, 11)];

        for (int i = 0; i < array.length; i++) 
        {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        
        int[] newArray = moveZerosToEnd(array);
        
        for (int i : newArray) 
        {
            System.out.print(i + " ");
        }
    }
    
    public static int[] moveZerosToEnd(int[] array) 
    {
        int[] newArray = new int[array.length];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] != 0) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }
}
