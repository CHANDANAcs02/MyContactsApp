import java.util.Scanner;

public class UseCase4CreateContactApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Create Contact ==========");

        System.out.print("Contact Type (Person/Organization): ");
        String type = scanner.nextLine();

        System.out.print("Contact Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = ContactFactory.createContact(type, name);

        contact.addPhoneNumber(new PhoneNumber(phone));
        contact.addEmail(new Email(email));

        System.out.println("\nContact Created Successfully!");
        System.out.println(contact);

        scanner.close();
    }
}