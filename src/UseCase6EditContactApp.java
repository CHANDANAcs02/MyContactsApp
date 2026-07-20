// UC6 - Edit Contact

public class UseCase6EditContactApp {

    public static void main(String[] args) {

        Contact contact = new Person("John");

        contact.addPhoneNumber(new PhoneNumber("0771234567"));
        contact.addEmail(new Email("john@gmail.com"));

        System.out.println("Before Update");
        System.out.println(contact);

        UpdateContactCommand command =
                new UpdateContactCommand(contact, "John Silva");

        command.execute();

        System.out.println("\nAfter Update");
        System.out.println(contact);

        command.undo();

        System.out.println("\nAfter Undo");
        System.out.println(contact);
    }
}