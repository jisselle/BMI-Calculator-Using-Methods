package edu.cscc;
import java.util.Scanner;
// Jisselle Garcia, 02/07/2023
// This program is a BMI Calculator

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double lbs, inches, kgs, meters, bmi;
        String classification;

        // Title of the program
        System.out.println("BMI Calculator\n");
        System.out.println();
        // Gathering user health metrics
        System.out.println("Please enter your weight (lbs): ");
        lbs = input.nextDouble();
        System.out.println("Please enter your height (inches): ");
        inches = input.nextDouble();
        // Calling methods
        kgs = convertToKilograms(lbs);
        meters = convertToMeters(inches);
        bmi = kgs/meters;
        // Output
        System.out.println("Your BMI is: " + (calcBMI(kgs, meters)));
        System.out.println("Your BMI classification is: " + bmiClassification(bmi));
    }

    //FOUR METHODS START HERE
    public static double convertToKilograms(double weight) {
        return (weight / 2.2046);
    }

    public static double convertToMeters(double height) {
        return (height / 39.37);
    }

    public static double calcBMI(double weight, double height) {
        return  (weight / Math.pow(height, 2.0));
    }

    public static String bmiClassification(double bmi) {
        String classification;

        if (bmi <= 18.5)
            classification = "Underweight";
        else if (bmi <= 25.0)
            classification = "Normal";
        else if (bmi <= 30.0)
            classification = "Overweight";
        else
            classification = "Obese";
        return classification;

    }

}