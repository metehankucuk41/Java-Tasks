import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates operations on a map of employees and their genders.
 * It includes methods to update gender values, count employees by gender,
 * and filter employees based on their gender.
 */
public class Employees {
    public static void main(String[] args) {

        /*
        Questions
        1. How many male and female employees are there in the map?
        2. List the names of all female employees.
        3. Update all "M" values to "Male" and all "F" values to "Female."
         */

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        updateGenderValues("F", "Female", employeeMap);
        updateGenderValues("M", "Male", employeeMap);
        System.out.println(employeeMap);
        System.out.println();

        System.out.println("Woman employees: " + getGenderEmployeeCount("F", employeeMap));
        System.out.println("Man employees: " + getGenderEmployeeCount("M", employeeMap));
        System.out.println();

        filterEmployeesByGender("F", employeeMap);

    }

    /**
     * Filters and prints employee names based on their gender.
     *
     * @param gender The gender to filter employees by (e.g., "Female" or "Male").
     * @param employeeMap The map containing employee names and their corresponding genders.
     */
    public static void filterEmployeesByGender(String gender, Map<String, String> employeeMap) {
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().startsWith(String.valueOf(gender.charAt(0)))) {
                System.out.println(entry.getKey());
            }
        }
    }

    /**
     * Counts the number of employees based on their gender.
     *
     * @param gender The gender to count employees by (e.g., "Female" or "Male").
     * @param employeeMap The map containing employee names and their corresponding genders.
     * @return The number of employees of the specified gender.
     */
    public static int getGenderEmployeeCount(String gender, Map<String, String> employeeMap) {

        int count = 0;
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().startsWith(String.valueOf(gender.charAt(0)))) {
                count++;
            }
        }
        return count;

    }

    /**
     * Updates the gender values in the map from old values to new values.
     *
     * @param genderOldValue The current gender value in the map (e.g., "F" or "M").
     * @param genderNewValue The new gender value to replace the old one (e.g., "Female" or "Male").
     * @param employeeMap The map containing employee names and their corresponding genders.
     */
    public static void updateGenderValues(String genderOldValue, String genderNewValue, Map<String, String> employeeMap) {
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals(genderOldValue)) {
                eachEntry.setValue(genderNewValue);
            }
        }
    }
}
