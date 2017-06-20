package com.sample.dto;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive car information
 *
 */

public class CarDto {

    private String id;

    private String plate;

    private String completionDate;

    private String color;

    private String lastMOT;

    private ModelDto model;

    private ManufacturerDto manufacturer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLastMOT() {
        return lastMOT;
    }

    public void setLastMOT(String lastMOT) {
        this.lastMOT = lastMOT;
    }

    public ModelDto getModel() {
        return model;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public ManufacturerDto getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerDto manufacturer) {
        this.manufacturer = manufacturer;
    }
}
