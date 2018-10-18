import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ContactDirectory05 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Phonebook phonebook = new Phonebook();

        try {
            phonebook = objectMapper.readValue(new File("phonebook.json"), Phonebook.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        phonebook.addContact("Test", "07889123987", "asdf");


        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("output.json"), phonebook);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(phonebook.toString());
    }
}
