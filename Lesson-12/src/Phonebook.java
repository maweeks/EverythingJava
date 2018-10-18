import java.util.Arrays;
import java.util.List;

public class Phonebook {
    private List<Contact> phonebook;

    public Phonebook() {
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phonebook=" + phonebook +
                '}';
    }

    public void addContact(String name, String phoneNumber, String email) {
        phonebook.add(new Contact(name, phoneNumber, email));
    }

    public List<Contact> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(List<Contact> phonebook) {
        this.phonebook = phonebook;
    }
}
