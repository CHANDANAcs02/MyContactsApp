import java.util.Optional;
import java.util.Scanner;

/**
 * ==========================================================
 * MyContacts App
 * Use Case 2 - User Authentication
 *
 * Concepts:
 * - Interface
 * - Polymorphism
 * - Strategy Pattern
 * - Singleton Pattern
 * - Optional
 * ==========================================================
 */
public class UseCase2AuthenticationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Existing registered user
        User registeredUser = new UserBuilder()
                .setFullName("Chandana")
                .setEmail("chandana@gmail.com")
                .setPassword(PasswordUtil.hashPassword("password123"))
                .setUserType("Premium")
                .build();

        Authentication authentication = new BasicAuth(registeredUser);

        System.out.println("==================================");
        System.out.println(" MyContacts - User Authentication");
        System.out.println("==================================");

        System.out.print("Email : ");
        String email = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        Optional<User> user = authentication.login(email, password);

        if (user.isPresent()) {

            SessionManager.getInstance().login(user.get());

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome " + user.get().getFullName());

        } else {

            System.out.println("\nInvalid Email or Password.");

        }

        scanner.close();
    }
}