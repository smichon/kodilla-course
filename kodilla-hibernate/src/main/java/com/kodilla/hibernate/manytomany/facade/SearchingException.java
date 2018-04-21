package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {
    public static String ERR_COMP_LIST_EMPTY = "List of companies is empty";
    public static String ERR_EMPL_LIST_EMPTY = "List of employees is empty";
    public static String ERR_COMP_NOT_FOUND = "Company has not been found";
    public static String ERR_EMPL_NOT_FOUND = "Employee has not been found";

    public SearchingException(String message) {
        super(message);
    }
}
