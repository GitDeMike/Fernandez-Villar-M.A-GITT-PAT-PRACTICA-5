package edu.comillas.icai.pat.ejemplopat.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import edu.comillas.icai.pat.ejemplopat.dto.Contact;
import edu.comillas.icai.pat.ejemplopat.dto.ContactManager;

@Service

public class ContactService {

    private ContactManager contactManager;

    // the class contact has the folowing field     private String name;
    // private String phone;
    // private String email;
    // private String idType;
    // private String id;
    // private String message;


    public ContactService(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    public ContactService() {
        this.contactManager = new ContactManager();
    }

    public void addContact(Map<String, Object> message) {
        try {
            verifyPayload(message);
            Contact contact = new Contact(message.get("name").toString(), message.get("phone").toString(),
                    message.get("email").toString(), message.get("idType").toString(), message.get("id").toString(),
                    message.get("message").toString());
            contactManager.addContact(contact);
            
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid payload");
        }
    }

    private void verifyPayload(Map<String, Object> message) {
        if (message.get("name") == null || message.get("phone") == null || message.get("email") == null
                || message.get("idType") == null || message.get("id") == null || message.get("message") == null) {
            throw new IllegalArgumentException("Invalid payload");
        }
    }

    
    
}
