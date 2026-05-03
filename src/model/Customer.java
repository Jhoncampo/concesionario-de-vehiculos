package model;

public class Customer {
    private String firstName;
    private String lastName;
    private String document;

    public Customer(String firstName, String lastName, String document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (ID: " + document + ")";
    }

}
