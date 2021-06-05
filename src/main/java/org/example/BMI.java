package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dfBMI = new DecimalFormat("#.##");

        String weightString = "abc";
        while(weightString.matches("(?s).*\\b[a-zA-Z]+\\b.*")) {
            System.out.print("What is your weight? (in pounds) ");
            weightString = input.nextLine();
        }
        double weightNumber = Double.parseDouble(weightString);

        String heightString = "abc";
        while(heightString.matches("(?s).*\\b[a-zA-Z]+\\b.*")) {
            System.out.print("What is your height? (in inches) ");
            heightString = input.nextLine();
        }
        double heightNumber = Double.parseDouble(heightString);

        double BMI = (weightNumber / (Math.pow(heightNumber, 2))) * 703 ;
        System.out.println("Your BMI is " + dfBMI.format(BMI));

        if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range.\n");
        }
        if (BMI < 18.5) {
            System.out.println("You are underweight. You should see your doctor.\n");
        }
        if (BMI > 25) {
            System.out.println("You are overweight. You should see your doctor.\n");
        }

    }
}
