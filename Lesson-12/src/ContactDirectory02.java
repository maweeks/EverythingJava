import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ContactDirectory02 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"phonebook\": [{\"name\": \"asdf\", \"phoneNumber\": \"1234\", \"email\": \"a@b.c\"}]}";

        Phonebook phonebook = new Phonebook();

        try {
            phonebook = objectMapper.readValue(json, Phonebook.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(phonebook.toString());
    }
}
