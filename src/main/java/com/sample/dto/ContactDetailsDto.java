package com.sample.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive
 *  contact details information
 *
 */
@Data
@Builder
public class ContactDetailsDto {

    private String email;

    private String phoneNumber;

    private String mobileNumber;

}
