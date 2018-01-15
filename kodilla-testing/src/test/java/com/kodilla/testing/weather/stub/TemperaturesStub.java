package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();

        stubResult.put(0, 25.5);
        stubResult.put(1, 26.2);
        stubResult.put(2, 25.1);
        stubResult.put(3, 26.1);
        stubResult.put(4, 25.9);

        return stubResult;
    }
}
