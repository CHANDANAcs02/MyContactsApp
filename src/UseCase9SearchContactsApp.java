import java.util.ArrayList;
import java.util.List;

// UC9 - Search Contacts

public class UseCase9SearchContactsApp {

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Person("John");
        contact1.addPhoneNumber(new PhoneNumber("0771234567"));
        contact1.addEmail(new Email("john@gmail.com"));

        Contact contact2 = new Person("Alice");
        contact2.addPhoneNumber(new PhoneNumber("0719876543"));
        contact2.addEmail(new Email("alice@gmail.com"));

        Contact contact3 = new Organization("ABC Company");
        contact3.addPhoneNumber(new PhoneNumber("0112345678"));
        contact3.addEmail(new Email("abc@gmail.com"));

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        System.out.println("Search by Name\n");

        ContactSearch.search(
                contacts,
                new NameSearch("Alice")
        );

        System.out.println("\nSearch by Phone\n");

        ContactSearch.search(
                contacts,
                new PhoneSearch("0771234567")
        );

        System.out.println("\nSearch by Email\n");

        ContactSearch.search(
                contacts,
                new EmailSearch("abc@gmail.com")
        );
    }
}