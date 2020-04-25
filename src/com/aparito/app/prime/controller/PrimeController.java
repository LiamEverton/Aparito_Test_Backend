package com.aparito.app.prime.controller;

import com.aparito.app.prime.Prime;
import com.fasterxml.jackson.databind.ObjectMapper;
import spark.Request;
import spark.Response;
import spark.Route;

public class PrimeController {

    /**
     * Used in the fetchPrime route.
     */
    private static final String PRIME_INPUT_ATTRIBUTE = "max-prime-number";

    /**
     * Defines the route for calculating prime numbers based off of a maximum input.
     * <p>
     * the maximum prime attribute is defined as PRIME_INPUT_ATTRIBUTE.
     */
    public static Route fetchPrime = (Request request, Response response) -> {
        response.type("application/json");

        try {
            int attribute = Integer.parseInt(request.queryParams(PRIME_INPUT_ATTRIBUTE));
            response.status(200);

            return Prime.calculatePrimes(attribute);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();

            response.status(406);
            return new ObjectMapper().writeValueAsString("Invalid number.");
        }
    };
}
