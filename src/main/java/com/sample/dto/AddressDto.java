package com.sample.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive address information
 *
 */
@Data
@Builder
public class AddressDto {

    private Integer number;

    private String street;

    private String city;

    private String postCode;

    private String country;

}
