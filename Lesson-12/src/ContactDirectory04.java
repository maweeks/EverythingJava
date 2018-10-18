import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ContactDirectory04 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Phonebook phonebook = new Phonebook();

        try {
            phonebook = objectMapper.readValue(new File("phonebook.json"), Phonebook.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("output.json"), phonebook);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(phonebook.toString());
    }
}
