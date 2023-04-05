package edu.comillas.icai.pat.ejemplopat.dto;


public class Contact {
    private String name;
    private String phone;
    private String email;
    private String idType;
    private String id;
    private String message;

    public Contact(String name, String phone, String email, String idType, String id, String message) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.idType = idType;
        this.id = id;
        this.message = message;
    }

    // Getters and setters for all instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
