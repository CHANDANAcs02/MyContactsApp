import java.util.Scanner;

/**
 * ==========================================================
 * MyContacts App
 * Use Case 3 - User Profile Management
 *
 * Concepts:
 * - Encapsulation
 * - Command Pattern
 * - Setter Methods
 * - Validation
 * ==========================================================
 */
public class UseCase3ProfileManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new UserBuilder()
                .setFullName("Chandana")
                .setEmail("chandana@gmail.com")
                .setPassword(PasswordUtil.hashPassword("password123"))
                .setUserType("Premium")
                .build();

        System.out.println("Current Profile");
        System.out.println("----------------");
        System.out.println(user);

        System.out.print("\nEnter New Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter New Email : ");
        String email = scanner.nextLine();

        ProfileCommand command = new UpdateProfileCommand(user, name, email);

        command.execute();

        System.out.println("\nUpdated Profile");
        System.out.println("----------------");
        System.out.println(user);

        scanner.close();
    }
}