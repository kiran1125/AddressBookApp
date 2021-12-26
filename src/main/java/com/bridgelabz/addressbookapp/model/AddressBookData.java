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

    AddressBookData(int id,ContactDTO contact){
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
}
