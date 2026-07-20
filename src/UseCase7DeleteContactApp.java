// UC7 - Delete Contact

public class UseCase7DeleteContactApp {

    public static void main(String[] args) {

        ContactManager manager = new ContactManager();

        manager.setObserver(new AdminObserver());

        Contact contact = new Person("John");

        contact.addPhoneNumber(new PhoneNumber("0771234567"));
        contact.addEmail(new Email("john@gmail.com"));

        manager.addContact(contact);

        System.out.println("Available Contacts");
        manager.showContacts();

        System.out.println("\nSoft Delete...");
        manager.softDelete(contact);

        System.out.println("\nAvailable Contacts");
        manager.showContacts();

        System.out.println("\nHard Delete...");
        manager.hardDelete(contact);

        System.out.println("\nCompleted.");
    }
}