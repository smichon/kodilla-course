package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1,1.5);
        } catch (Exception e) {
            System.out.println("Exception occurred. Details below.\n" + e);
        } finally {
            System.out.println("\n-----Watch out on exceptions-----");
        }
    }
}
