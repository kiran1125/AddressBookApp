package com.bridgelabz.addressbookapp.dto;

public class ContactDTO {
    private String name;
    private String city;
    private String state;
    private long pincode;
    private long phoneNumber;


    public ContactDTO(String name, String city, String state, long pincode, long phoneNumber) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "ContactDTO [city=" + city + ", name=" + name + ", phoneNumber=" + phoneNumber + ", pincode=" + pincode
                + ", state=" + state + "]";
    }
    

}
