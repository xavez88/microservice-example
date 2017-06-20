package com.sample.dto;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 * Model/Data Transfer Object to send/receive car information
 *
 */
public class ManufacturerDto {

    private String id;

    private String name;

    private ContactDetailsDto contactDetails;

    private AddressDto address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactDetailsDto getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsDto contactDetails) {
        this.contactDetails = contactDetails;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
