// UC11 - Create and Manage Tags

public class UseCase11ManageTagsApp {

    public static void main(String[] args) {

        Contact contact = new Person("John");

        contact.addPhoneNumber(new PhoneNumber("0771234567"));
        contact.addEmail(new Email("john@gmail.com"));

        contact.addTag(TagFactory.getTag("Family"));
        contact.addTag(TagFactory.getTag("Work"));
        contact.addTag(TagFactory.getTag("Family"));

        System.out.println(contact);
    }
}