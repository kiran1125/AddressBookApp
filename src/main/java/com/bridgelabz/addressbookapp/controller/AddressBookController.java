package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.ContactDTO;

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
    
    @RequestMapping("/get")
	public ResponseEntity<String> getAddressBook(){
		return new ResponseEntity<String>("Its Suceesfully connected",HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAddressBookById(@PathVariable ("id") int id){
		return new ResponseEntity<String>("Getting the details of addressBook with id :" + id,HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> addingContact(@RequestBody ContactDTO contact){
		return new ResponseEntity<String>("adding the details of contact :" + contact,HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> updatingContact(@RequestBody ContactDTO contact){
		return new ResponseEntity<String>("updating the details of contact :" + contact,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteContactById(@PathVariable ("id") int id){
		return new ResponseEntity<String>("Deleting the contact with id :" + id,HttpStatus.OK);
	}
}
