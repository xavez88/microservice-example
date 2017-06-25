package com.sample.service;

import com.sample.dto.CarDto;

import java.util.Map;

/**
 * Created by antoniochavez on 20/06/2017.
 *
 * Service to perform Car operations
 */
public interface CarService {

    /**
     * Retrieves a car using its id.
     * @param carId the ID of the card
     * @return the car details
     */
    CarDto find(final String carId);

    /**
     * Creates a new instance of a car object using the details passed as a parameter.
     * @param car the details of the car.
     * @return the instance of the recently created car, including its new assigned ID.
     */
    CarDto create(final CarDto car);

    /**
     * Updates an existing car using the details passed as parameter.
     * The car instance is updated in full.
     * @param car the details to update the existing car with.
     * @return the updated car instance.
     */
    CarDto update(final CarDto car);

    /**
     * Updates an existing car instance updating only the attributes passed as parameters.
     * @param carId the Id of the car to be updated
     * @param values map containing the key value pairs to update the a
     * @return
     */
    CarDto partialUpdate(String carId, final Map<String, Object> values);

    /**
     * Removes an existing car instance.
     * @param carId the Id of the car to be deleted.
     */
    void delete(final String carId);
}
