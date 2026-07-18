/**
 * Factory Pattern for creating User objects.
 */
public class UserFactory {

    public static User createUser(UserBuilder builder) {
        return builder.build();
    }
}