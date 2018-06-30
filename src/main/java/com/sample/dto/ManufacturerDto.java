package com.sample.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 * Model/Data Transfer Object to send/receive car information
 *
 */
@Data
@Builder
public class ManufacturerDto {

    private String id;

    private String name;

    private ContactDetailsDto contactDetails;

    private AddressDto address;

}
