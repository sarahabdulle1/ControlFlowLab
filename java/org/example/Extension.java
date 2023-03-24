//Create a program that makes suggestions on what to wear based on information it gathers about the weather.
package org.example;

import java.util.Scanner;
public class Extension {
    public static void main(String[] args) {

//  Prompt user to describe what the weather is like, giving parameters
        System.out.println("Let's decide what to wear. Is the weather rainy, sunny, cloudy or snowy?");

//  Collect the user input in a string format.
        Scanner reader = new Scanner(System.in);
        String describeWeather = reader.nextLine();
        describeWeather.toLowerCase();

//  Prompt the user to input the average temperature of the day.
        System.out.println("Please enter the average temperature of the day in degrees celsius.");

//  Collect the user input in integer format
        Scanner secondreader = new Scanner(System.in);
        String enterTemperatureString = secondreader.nextLine();
        int enteredTemperature = Integer.valueOf(enterTemperatureString);
//      FUTURE TIPS: use [reader.nextInt()] instead of [nextLine() and  Integer.valueOf()]


//        If rainy AND above 15 degrees. Wear a light raincoat. Under 15 degrees. Wear a waterproof winter coat.
//        If sunny AND above 18 degrees. Wear sunglasses. Under 18 degrees. Wear warm clothing. Do not be deceived by the sun!
//        If cloudy AND above 22 degrees. Wear light clothing. If under. Dress warm.
//        If snowy OR less than 2 degrees. Wear gloves and a winter coat.
        if (describeWeather.equals("snowy") || enteredTemperature < 2) {
            System.out.println("Wear gloves and a winter coat.");
        } else if (enteredTemperature <= 15 && describeWeather.equals("rainy")) {
            System.out.println("Wear a waterproof winter coat.");
        } else if (enteredTemperature > 15 && describeWeather.equals("rainy")) {
            System.out.println("Wear a light raincoat or bring an umbrella.");
        } else if (enteredTemperature > 18 && describeWeather.equals("sunny")) {
            System.out.println("Wear sunglasses");
        } else if (enteredTemperature <= 18 && describeWeather.equals("sunny")) {
            System.out.println("Wear warm clothing. Do not be deceived by the sun!");
        } else if (enteredTemperature >= 22  && describeWeather.equals("cloudy")) {
            System.out.println("Wear light clothing.");
        } else if (enteredTemperature < 22 && describeWeather.equals("cloudy")) {
            System.out.println("Dress warm.");
        }
//        FUTURE TIPS: 'BOUNCER PATTERN': separate the if statements instead of a long if statement.
//                      They should logically follow from each other and rely on each other
    }
}
