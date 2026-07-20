// UC8 - Bulk Operations

public class UseCase8BulkOperationsApp {

    public static void main(String[] args) {

        Contact contact1 = new Person("John");
        contact1.addPhoneNumber(new PhoneNumber("0771234567"));
        contact1.addEmail(new Email("john@gmail.com"));

        Contact contact2 = new Person("Alice");
        contact2.addPhoneNumber(new PhoneNumber("0719876543"));
        contact2.addEmail(new Email("alice@gmail.com"));

        Contact contact3 = new Organization("ABC Company");
        contact3.addPhoneNumber(new PhoneNumber("0112345678"));
        contact3.addEmail(new Email("abc@gmail.com"));

        ContactGroup friends = new ContactGroup("Friends");

        friends.add(contact1);
        friends.add(contact2);
        friends.add(contact3);

        System.out.println("Before Bulk Delete");
        friends.showDetails();

        friends.deleteAll();

        System.out.println("\nAfter Bulk Delete");
        friends.showDetails();
    }
}