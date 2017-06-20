package com.sample.dto;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive
 *  contact details information
 *
 */
public class ContactDetailsDto {

    private String email;

    private String phoneNumber;

    private String mobileNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
