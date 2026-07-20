import java.util.ArrayList;
import java.util.List;

// UC10 - Advanced Filtering

public class UseCase10AdvancedFilteringApp {

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Person("David");
        contact1.addPhoneNumber(new PhoneNumber("0711111111"));
        contact1.addEmail(new Email("david@gmail.com"));

        Contact contact2 = new Person("Alice");
        contact2.addPhoneNumber(new PhoneNumber("0722222222"));
        contact2.addEmail(new Email("alice@gmail.com"));

        Contact contact3 = new Organization("ABC Company");
        contact3.addPhoneNumber(new PhoneNumber("0112345678"));
        contact3.addEmail(new Email("abc@gmail.com"));

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        FilterManager manager = new FilterManager();

        System.out.println("Sort By Name\n");

        manager.setStrategy(new NameSortStrategy());

        List<Contact> sorted = manager.execute(contacts);

        for (Contact contact : sorted) {
            System.out.println(contact);
        }

        System.out.println("\nRecent Contacts\n");

        manager.setStrategy(new RecentContactStrategy());

        List<Contact> recent = manager.execute(contacts);

        for (Contact contact : recent) {
            System.out.println(contact);
        }
    }
}