package com.service.studentvueservice.models;
//A model object is a Java object that represents, or models, an item in the application. in this case we are modeling Family Names
// Models are DTOs - Data transfer Objects
public class FamilyNameModel {// variables/attributes ar set as private to make sure make sure that "sensitive" data is hidden from users.
    // this is called Encapsulation
    private Integer id;
    private String firstname;
    private String lastname;

    //A constructor in Java is a special method that is used to initialize objects.
    // The constructor is called when an object of a class is created. It can be used to set initial values for object attributes
    //In this case we are initializing the FamilyName object
    public FamilyNameModel(Integer id, String firstname, String lastname) {
        this.id = id; // Set the initial value for the class attribute id
        this.firstname = firstname; // Set the initial value for the class attribute firstname
        this.lastname = lastname; // Set the initial value for the class attribute lastname
    }

    //Getters and Setters - The get method returns the variable value, and the set method sets the value.
    public Integer getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}