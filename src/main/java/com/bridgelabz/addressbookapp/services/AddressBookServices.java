package com.bridgelabz.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import org.springframework.stereotype.Service;

@Service
public class AddressBookServices implements IAddressBookServices {

    @Override
    public List<AddressBookData> getContactData() {
        List<AddressBookData> contactList = new ArrayList<>();
        contactList.add( new AddressBookData(1, new ContactDTO("kiran", "Hindupur", "AP", 515201, 966606929)));
        return contactList;
    }

    @Override
    public AddressBookData getContactDataById(int id) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(id, new ContactDTO("karthik", "Hindupur", "AP", 515201, 966606929));
        return contactData;
    }

    @Override
    public AddressBookData addEmployeeData(ContactDTO contact) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(1, contact);
        return contactData;
    }

    @Override
    public AddressBookData updateEmployeeData(ContactDTO contact) {
        AddressBookData contactData = null;
        contactData = new AddressBookData(1, contact);
        return contactData;
    }

    @Override
    public void deleteEmployeeData(int id) {
        
    }
    
}
