package edu.comillas.icai.pat.ejemplopat.dto;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ContactManager {

    ArrayList<Contact> contacts = new ArrayList<Contact>();


    public static String CSV_FILE_PATH = "../contactos.csv";

    public ArrayList<Contact> getContacts() {
        return contacts;
    }


    public void addContact(Contact contact) {
        contacts.add(contact);
        try {
            // Open a BufferedWriter to append to the CSV file
            BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_PATH, true));
            
            // Write the contact data to the CSV file in the appropriate format
            writer.write(contact.getName() + "," + contact.getPhone() + "," + contact.getEmail() + "," 
                    + contact.getIdType() + "," + contact.getId() + "," + contact.getMessage());
            
            // Add a newline character to separate each contact on a new line
            writer.newLine();
            
            // Close the writer to flush and release resources
            writer.close();
            
            System.out.println("Contact added successfully!");
        } catch (IOException e) {
            System.err.println("Error adding contact to CSV file: " + e.getMessage());
        }
    }
}
