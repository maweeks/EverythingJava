import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ContactDirectory01 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"name\": \"asdf\", \"phoneNumber\": \"1234\", \"email\": \"a@b.c\"}";

        Contact contact = new Contact();

        try {
            contact = objectMapper.readValue(json, Contact.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contact.toString());
    }
}
