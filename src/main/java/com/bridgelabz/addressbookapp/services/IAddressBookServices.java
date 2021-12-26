package com.bridgelabz.addressbookapp.services;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookServices {

    List<AddressBookData> getContactData();

    AddressBookData getContactDataById(int id);

    AddressBookData addEmployeeData(ContactDTO contact);

    AddressBookData updateEmployeeData(int id,ContactDTO contact);

    void deleteEmployeeData(int id);
    
}
