package com.sample.dto;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 *  Model/Data Transfer Object to send/receive model information
 *
 */
public class ModelDto {

    private String id;

    private String name;

    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
