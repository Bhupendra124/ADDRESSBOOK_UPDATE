package com;

public class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    Long zipCode;
    Long phoneNumber;
    String email;

    public Contacts(String firstName, String lastName, String address, String city, String state, Long zipCode, Long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Contacts contacts = new Contacts("BHUPENDRA", "WADEKAR", "GOVIND COLONY AFS STATION ", "AMLA", "MP", "460551", "9893902047", "wadekar.bhupendra6@gmail.com");
    }
}