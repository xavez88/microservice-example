package com.sample.controller;

import com.sample.dto.CarDto;
import com.sample.service.CarService;
import com.sample.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by antoniochavez on 10/06/2017.
 * <p>
 * Controller class to handle all car related requests.
 */

@RequestMapping(UrlConstants.CARS_ROOT_MAPPING)
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDto create(@RequestBody CarDto car) {

        return carService.create(car);
    }

    @GetMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.OK)
    public CarDto read(@PathVariable("carId") String carId) {

        return carService.find(carId);
    }

    @PutMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.OK)
    public CarDto update(@PathVariable("carId") String carId,
                         @RequestBody CarDto car) {

        return carService.update(car);
    }

    @PatchMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.OK)
    public CarDto updatePartially(@PathVariable("carId") String carId,
                                  Map<String, Object> args) {

        return carService.partialUpdate(carId,args);
    }

    @DeleteMapping(UrlConstants.CAR_ID_MAPPING)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("carId") String carId) {

        carService.delete(carId);
    }


}
