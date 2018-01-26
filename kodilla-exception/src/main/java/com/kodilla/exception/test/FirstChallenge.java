package com.kodilla.exception.test;

public class FirstChallenge {
    private int a;
    private int b;
    private double result;

    public double divide(double a, double b) throws ArithmeticException {

            if(b == 0){
                try {
                    result = a/b;
                    throw new ArithmeticException();

                } catch (ArithmeticException e){
                    System.out.println("Division by 0 int type values can cause exception like this => " + e);
                } finally {
                    System.out.println("Double type values (!=0) can be divided by 0 and the result is (+/-)Infinity," +
                            " but if You try 0 divide by 0, You wil get NaN");
                }
            }
            return result ;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args){
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(7,0);
        System.out.println(result);
    }
}
