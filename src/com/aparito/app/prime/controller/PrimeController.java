package com.aparito.app.prime.controller;

import com.aparito.app.prime.Prime;
import spark.Request;
import spark.Response;
import spark.Route;

public class PrimeController {

    private static String PRIME_INPUT_ATTRIBUTE = "max-prime-number";

    public static Route fetchPrime = (Request request, Response response) -> {
        try {
            int attribute = Integer.parseInt(request.queryParams(PRIME_INPUT_ATTRIBUTE));
            response.status(200);

            return Prime.calculatePrimes(attribute);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();

            response.status(406);

            return "Invalid number.";
        }
    };
}
