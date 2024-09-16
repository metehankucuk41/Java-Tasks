public class PasswordObj {
    public static void main(String[] args) {
        /*
        Create an encapsulated class named "Password" with attributes "password" and "username." Along with getters and setters, include the following conditions:

        The username can only be set if it is null.
                The username can only be retrieved via get if the first three characters are correct.
        The password can only be retrieved via get if it is not null and the username is provided correctly.
        The password can only be set if the username is correct.*/

        Password password = new Password();

        // Test setUsername method
        System.out.println("Setting username to 'User123':");
        password.setUsername("User123");

        System.out.println("\nSetting username to 'NewUser':");
        password.setUsername("NewUser");

        // Test getUsername method
        System.out.println("\nGetting username with 'Use':");
        String username = password.getUsername("Use");

        System.out.println("Retrieved username: " + username);


    }
}
