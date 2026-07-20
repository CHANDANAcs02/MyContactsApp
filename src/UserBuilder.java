/**
 * Builder Pattern for creating User objects.
 */
public class UserBuilder {

    private String fullName;
    private String email;
    private String password;
    private String userType;

    public UserBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setUserType(String userType) {
        this.userType = userType;
        return this;
    }

    public User build() {

        if (userType.equalsIgnoreCase("Premium"))
        {
            return new PremiumUser(fullName, email, password);
        }

        return new FreeUser(fullName, email, password);
    }
}