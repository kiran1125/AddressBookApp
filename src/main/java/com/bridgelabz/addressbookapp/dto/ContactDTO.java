package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;


public @Data class ContactDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z]{3,}" , message = "Contact name is Invalid")
    private String name;
    @NotEmpty(message = "city should not be Empty" )
    private String city;
    @NotEmpty(message = "state should not be Empty" )
    private String state;
    @NotNull
    private long pincode;
    @NotNull
    private long phoneNumber;


    
}
