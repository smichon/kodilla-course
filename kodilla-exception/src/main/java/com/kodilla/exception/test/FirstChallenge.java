package com.kodilla.exception.test;

public class FirstChallenge {
    private static double result;

    public double divide(double a, double b) throws ArithmeticException {

            if(b == 0){
                throw new ArithmeticException();
            }
            return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args){
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            result = firstChallenge.divide(8,0);

        } catch (ArithmeticException e){
            System.out.println("You have tried to divide by 0. \nDivision by 0 can cause exception like this => " + e);
        } finally {
            System.out.println("Calculation below is correct when second value is different from 0, (b!=0)");
            System.out.println(result);
        }
    }
}
