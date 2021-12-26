package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import org.springframework.stereotype.Service;

@Service
public class AddressBookServices implements IAddressBookServices {

    List<AddressBookData> contactList = new ArrayList<>();

    @Override
    public List<AddressBookData> getContactData() {
        return contactList;
    }

    @Override
    public AddressBookData getContactDataById(int id) {
        return contactList.get(id);
    }

    @Override
    public AddressBookData addEmployeeData(ContactDTO contact) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(contactList.size() + 1, contact);
        contactList.add(contactData);
        return contactData;
    }

    @Override
    public AddressBookData updateEmployeeData(int id,ContactDTO contact) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(id, contact);
        return contactData;
    }

    @Override
    public void deleteEmployeeData(int id) {
        contactList.remove(id);
    }
    
}
