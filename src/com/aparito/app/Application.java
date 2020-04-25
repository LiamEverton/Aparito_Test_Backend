package com.aparito.app;

import com.aparito.app.prime.controller.PrimeController;
import com.aparito.app.util.Path;
import spark.Filter;
import spark.Spark;

import static spark.route.HttpMethod.before;

public class Application {

    /**
     * Entry point for the web application.
     */
    public static void main(String[] args) {
        //Configure Spark.
        Spark.port(4567);

        Spark.after((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
            response.header("Access-Control-Allow-Methods", "GET");
        });

        Spark.get(Path.Web.PRIME, PrimeController.fetchPrime);
    }
}
