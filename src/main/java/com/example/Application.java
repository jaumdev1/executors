package com.example;

import com.example.executors.WorkExecutor;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {

        Micronaut.run(Application.class, args);
    }

}