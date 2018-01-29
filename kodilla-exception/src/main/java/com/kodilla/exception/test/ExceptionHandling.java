package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1,1.5);
        } catch (ExceptionHandling e) {
            System.out.println("Exception occurred. Details below.\n" + e.exceptionDescription());
        } finally {
            System.out.println("\n-----Watch out on exceptions-----");
        }
    }


    public String exceptionDescription(){
        return "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "If You see this text, it means that exception has occurred in class: 'SecondChallenge'," +
                " method: 'probablyIWillThrowException(x,y)'. \n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
