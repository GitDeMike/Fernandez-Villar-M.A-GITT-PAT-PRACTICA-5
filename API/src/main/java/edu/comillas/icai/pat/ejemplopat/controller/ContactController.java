package edu.comillas.icai.pat.ejemplopat.controller;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.comillas.icai.pat.ejemplopat.service.ContactService;


@RestController
public class ContactController {

    private ContactService contactService = new ContactService();



    @PostMapping(path = "/contact", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "*")
    public ResponseEntity<Object> addContactMessage(@RequestBody Map<String, Object> message) {
        try {
            contactService.addContact(message);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}