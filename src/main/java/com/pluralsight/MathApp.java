package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //1
        int bobSalary = 100;
        int garySalary = 101;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: " + highestSalary);

        //2
        int carPrice = 999;
        int truckPrice = 222;
        int smallestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The smallest price is: " + smallestPrice);


        //3
        double r = 7.25;

        double area = Math.PI * r * r;

        System.out.println("The area of a circle with radius of 7.25 is: " + area);

        //4
        double squareRootFive = Math.sqrt(5);
        System.out.println("square root of 5 is: " + squareRootFive);

        //5
        int x1 = 85, x2 = 5;
        int y1 = 50, y2 = 10;
        int xDist = x1 - x2;
        int yDist = y1 - y2;
        System.out.println("distance between (5,10) and (85,50) is: " + xDist + " " + yDist );

        //6
        double absolute = Math.abs(-3.8);
        System.out.println("The absolute value of -3.8 is: " + absolute);

        //7
        double random = Math.random();
        System.out.println("The random number is: " + random);


    }
}
