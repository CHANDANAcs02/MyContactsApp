// UC5 - View Contact Details

public class UseCase5ViewContactApp {

    public static void main(String[] args) {

        Contact contact = new Person("John Smith");

        contact.addPhoneNumber(new PhoneNumber("0771234567"));
        contact.addEmail(new Email("johnsmith@gmail.com"));

        System.out.println("Original Contact");
        System.out.println(contact);

        System.out.println("\nName in Uppercase");
        Contact upper = new UpperCaseDecorator(contact);
        System.out.println(upper);

        System.out.println("\nMasked Email");
        Contact masked = new MaskEmailDecorator(contact);
        System.out.println(masked);
    }
}