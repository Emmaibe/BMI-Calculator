package com.lordibe;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Check your BMI");

        System.out.println("Your Weight in Pound(lb): ");
        int weight = scanner.nextInt();

        System.out.println("Your Height in inches(in): ");
        int height = scanner.nextInt();

        float bmi = (float) weight/(height*height) * 703;

        if (bmi >= 25.0) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are OVERWEIGHT, Do more work");
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are HEALTHY, Continue the good work");
        } else {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are UNDERWEIGHT, Please eat Healthy");
        }

        scanner.close();
    }
}