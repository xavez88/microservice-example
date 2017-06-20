package com.sample.controller;

import com.sample.dto.CarDto;
import com.sample.utils.UrlConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by antoniochavez on 10/06/2017.
 *
 *  Controller class to handle all car related requests.
 *
 */

@RequestMapping(UrlConstants.CARS_ROOT_MAPPING)
public class CarController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDto create(){
        return null;
    }

    @GetMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.OK)
    public CarDto read(){
        return null;
    }

    @PutMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.OK)
    public CarDto update(){
        return null;
    }

    @PatchMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.OK)
    public CarDto updatePartially(){
        return null;
    }

    @DeleteMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(){

    }


}
