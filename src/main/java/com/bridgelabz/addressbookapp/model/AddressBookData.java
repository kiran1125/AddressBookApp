package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.ContactDTO;

public class AddressBookData {
    private int id;
    private String name;
    private String city;
    private String state;
    private long pincode;
    private long phoneNumber;

    public AddressBookData() {
    }

    public AddressBookData(int id,ContactDTO contact){
        this.id = id;
        this.name = contact.getName();
        this.city = contact.getCity();
        this.state = contact.getState();
        this.pincode = contact.getPincode();
        this.phoneNumber = contact.getPhoneNumber();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddressBookData [city=" + city + ", id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber
                + ", pincode=" + pincode + ", state=" + state + "]";
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
