package com.sample.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive car information
 *
 */
@Data
@Builder
public class CarDto {

    private String id;

    private String plate;

    private String completionDate;

    private String color;

    private String lastMOT;

    private ModelDto model;

    private ManufacturerDto manufacturer;
}
