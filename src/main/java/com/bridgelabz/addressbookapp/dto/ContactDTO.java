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


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    public long getPincode() {
        return pincode;
    }


    public void setPincode(long pincode) {
        this.pincode = pincode;
    }


    public long getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

}
