package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        /*
            Create two variables to represent the salary for Bob and Gary, name them
            bobSalary and garySalary. Create a new variable named
            highestSalary. Determine whose salary is greater using Math.max() and
            store the answer in highestSalary. Set the initial salary variables to any
            value you want. Print the answer (i.e "The highest salary is ...")
         */

        System.out.println("Question #1");

        //variables that represent Bob and Gary's salary
        int bobSalary = 45000;
        int garySalary = 185000;

        //store the higher salary in the highestSalary variable
        int highSalary = Math.max(bobSalary, garySalary);

        //print out a sentence with the highest salary
        System.out.println("The highest salary is " + "$" + highSalary);

        //line break
        System.out.println();


        System.out.println("Question #2");
        /*Find and display the smallest of two variables named carPrice and
        truckPrice. Set the variables to any value you want.
         */

        //variables that represent the carPrice and the truckPrice
        int carPrice = 45000;
        int truckPrice = 75000;

        //storing the lowest price on the lowestPrice variable with Math.min
        int lowestPrice = Math.min(carPrice, truckPrice);

        //printing out a sentence dictating
        System.out.println("The smallest price for the vehicle is " + "$" + lowestPrice);

        //line break
        System.out.println();

        System.out.println("Question #3");
        //Find and display the area of a circle whose radius is 7.25

        //variable that represents the radius of the circle
        double circleRadius = 7.25;

        //variable that represents the area of the circle with Math.PI
        double area = Math.PI * circleRadius * circleRadius;

        //printing out the statement of the area
        System.out.println("The area of a circle with a radius of " + Math.round(area));

        //line break
        System.out.println();

        System.out.println("Question #4");
        //find and display the square root of a variable after it is set to 5.0

        //variable that represents number to get square root
        double squareRootOfNum = 5.0;

        //print out the statement for this
        System.out.println("The square root for " + squareRootOfNum + " is " + Math.round(Math.sqrt(squareRootOfNum)));

        //line break
        System.out.println();

        System.out.println("Question #5");
        //Find and display the distance between the points (5, 10) and (85, 50)

        //variables for distance between the points

        int dist1x = 5;
        int dist1y = 10;
        int dist2x = 85;
        int dist2y = 50;

        double distance = Math.sqrt(dist2x - dist1x) + (dist2y - dist1y);
        System.out.println("The distance between the points is " + distance);

        //line break
        System.out.println();

        System.out.println("Question #6");
        //Find and display the absolute (positive) value of a variable after it is set to -3.8

        double setVar = -3.8;

        //print the variable with the absolute value
        System.out.println("The absolute value of the variable is " + Math.abs(setVar));

        //line break
        System.out.println();

        System.out.println("Question #7");
        //Find and display a random number between 0 and 1

        double randomNum = Math.random();

        //printing out the random number
        System.out.println("Random Number is: " + randomNum);

















    }
}
