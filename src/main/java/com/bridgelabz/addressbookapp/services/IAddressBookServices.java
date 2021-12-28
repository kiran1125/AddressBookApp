package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookServices {

    List<AddressBookData> getContactData();

    AddressBookData getContactDataById(int id);

    AddressBookData addContactData(ContactDTO contact);

    AddressBookData updateContactData(int id,ContactDTO contact);

    void deleteContactData(int id);
    
}
