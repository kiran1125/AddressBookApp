package com.bridgelabz.addressbookapp.controller;

import java.util.List;

import javax.validation.Valid;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.services.IAddressBookServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @Autowired
	private IAddressBookServices addressBookServices;

    @GetMapping("/get")
	public ResponseEntity<ResponseDTO> getAddressBook(){
		List<AddressBookData> contactList = null;
		contactList = addressBookServices.getContactData();
		ResponseDTO responseDTO = new ResponseDTO("Get call Successful", contactList);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookById(@PathVariable ("id") int id){
		AddressBookData contactData = null;
		contactData = addressBookServices.getContactDataById(id);
		ResponseDTO responseDTO = new ResponseDTO("Get call for id Successful", contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<ResponseDTO> addingContact(@Valid @RequestBody ContactDTO contact){
		AddressBookData contactData = null;
		contactData = addressBookServices.addContactData(contact);
		ResponseDTO responseDTO = new ResponseDTO("post data is Successful", contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<ResponseDTO> updatingContact(@PathVariable("id") int id,@Valid @RequestBody ContactDTO contact){
		AddressBookData contactData = null;
		contactData = addressBookServices.updateContactData(id,contact);
		ResponseDTO responseDTO = new ResponseDTO("update data is Successful", contactData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteContactById(@PathVariable ("id") int id){
		addressBookServices.deleteContactData(id);
		ResponseDTO responseDTO = new ResponseDTO("delete data is Successful of id :", id);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
}
