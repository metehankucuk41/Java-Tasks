/**
 * The Password class encapsulates the attributes password and username.
 * It includes validation and encapsulation through getter and setter methods
 * with specific rules for accessing and modifying these attributes.
 */
public class Password {
    private String password;
    private String username;

    /**
     * Retrieves the username if the first three characters of the provided username
     * match the stored username.
     *
     * @param username The username to compare.
     * @return The stored username if it matches the first three characters, otherwise null.
     */
    public String getUsername(String username) {
        if (this.username.startsWith(username.substring(0,3))) {
            return this.username;
        } else {
            System.out.println("Username does not start with " + username.substring(0,3));
            return null;
        }
    }

    /**
     * Sets the username only if the current username is null and the provided username is valid.
     *
     * @param username The username to be set.
     */
    public void setUsername(String username) {
        if (this.username == null && isValidUsername(username)) {
            this.username = username;
        }
    }

    /**
     * Retrieves the password if the provided username matches the stored username
     * and the password is not null.
     *
     * @param username The username to compare.
     * @return The stored password if the username matches and the password is not null, otherwise null.
     */
    public String getPassword(String username) {
        if (this.username.equals(username) && this.password != null) {
            return this.password;
        } else {
            System.out.println("Invalid username or null password");
            return null;
        }
    }

    /**
     * Sets the password if the provided username matches the stored username and
     * the password is not blank.
     *
     * @param username The username to compare.
     * @param password The password to be set.
     */
    public void setPassword(String username, String password) {
        if (this.username.equals(username) && !password.isBlank()) {
            this.password = password;
        }
        else {
            System.out.println("Invalid username or null password");
        }
    }

    /**
     * Validates the provided username. A valid username cannot be blank and must consist
     * of only alphabetic characters.
     *
     * @param username The username to validate.
     * @return True if the username is valid, otherwise false.
     */
    private boolean isValidUsername(String username) {
        if (username.isBlank()) {
            System.out.println("Username cannot be blank.");
            return false;
        } else  {
            for (int i = 0; i < username.length(); i++) {
                if (!Character.isLetter(username.charAt(i))) {
                    System.out.println("Username contains invalid characters");
                    return false;
                }
            }
            return true;
        }
    }
}
