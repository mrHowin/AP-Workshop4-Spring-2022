package com.company;

// this class will get the first name and last name of users
public class Person {
    private String  firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //this method return First name and Last name
    public String toString(){
    String fullName = getFirstName() + ""+ getLastName();
    return fullName;
    }
}
