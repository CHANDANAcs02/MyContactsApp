import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Contact {

    private String id;
    private String name;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;
    private LocalDateTime createdDate;

    public Contact(String name) {

        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.createdDate = LocalDateTime.now();
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public String getName() {
        return name;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {

        return "\nContact ID : " + id +
                "\nName       : " + name +
                "\nPhones     : " + phoneNumbers +
                "\nEmails     : " + emails +
                "\nCreated On : " + createdDate;
    }
}