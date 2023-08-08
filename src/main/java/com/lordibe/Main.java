package com.lordibe;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check your BMI");

        System.out.println("Your Weight in Kilogram(kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Your Height in Meters(m): ");
        double height = scanner.nextDouble();

        double bmi = Math.ceil(weight/Math.pow(height, 2));
        if (bmi >= 30) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are OBESE, Please you need to do something urgently");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are OVERWEIGHT, Do more work");
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You have a NORMAL WEIGHT, Continue the good work");
        } else {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are UNDERWEIGHT, Please eat Healthy");
        }

        scanner.close();
    }
}
