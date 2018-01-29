package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public String ExceptionDescription(){
        return  "airport was not found in our database or we can't flight there. " +
                "We couldn't match your flight. Sorry..";
    }
}
