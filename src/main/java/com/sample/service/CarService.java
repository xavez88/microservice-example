package com.sample.service;

import com.sample.dto.CarDto;

import java.util.Map;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 * Service to perform Car operations
 */
public interface CarService {

    CarDto find(final String carId);

    CarDto create(final CarDto car);

    CarDto update(final CarDto car);

    CarDto partialUpdate(final Map<String,Object> values);

    void delete(final String carId);
}
