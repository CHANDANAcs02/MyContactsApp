/**
 * Represents a user in the MyContacts application.
 * Demonstrates Encapsulation.
 */
public class User {

    private String fullName;
    private String email;
    private String password;
    private String userType;

    public User(String fullName, String email, String password, String userType) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "Name      : " + fullName +
                "\nEmail     : " + email +
                "\nUser Type : " + userType;
    }
}