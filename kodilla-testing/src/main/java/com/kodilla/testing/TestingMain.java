package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        calculator.add(10,7);
        calculator.subtract(8,3);

        if (calculator.getSum() == 17) {
            System.out.println("Test OK. Sum of 10 and 7 is "+calculator.getSum());
        } else {
            System.out.println("Error, something's wrong.");
        }

        if (calculator.getDiff()==5) {
            System.out.println("Test OK. Diff between 8 and 3 is "+calculator.getDiff());
        } else {
            System.out.println("Error, something's wrong.");
        }
    }
}
