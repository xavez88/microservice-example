package com.sample.dto;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive address information
 *
 */
public class AddressDto {

    private Integer number;

    private String street;

    private String city;

    private String postCode;

    private String country;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
