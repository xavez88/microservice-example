package com.sample.service.stubs;

import com.sample.dto.CarDto;
import com.sample.service.CarService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 * Stub implementation for {@link CarService}
 *
 */

@Service
public class CarServiceStub implements CarService{

    @Override
    public CarDto find(String carId) {
        return null;
    }

    @Override
    public CarDto create(CarDto car) {
        return null;
    }

    @Override
    public CarDto update(CarDto car) {
        return null;
    }

    @Override
    public CarDto partialUpdate(Map<String, Object> values) {
        return null;
    }

    @Override
    public void delete(String carId) {

    }
}
