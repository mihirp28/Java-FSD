package com.jap.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user
        int choice = scanner.nextInt();

        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it

    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice) {

    }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
        return (side*side);
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
        return 3.14*radius*radius;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
        return length*breadth;
    }
}
