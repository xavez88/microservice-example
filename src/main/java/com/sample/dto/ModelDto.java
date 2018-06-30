package com.sample.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive model information
 *
 */
@Data
@Builder
public class ModelDto {

    private String id;

    private String name;

    private String description;

}
