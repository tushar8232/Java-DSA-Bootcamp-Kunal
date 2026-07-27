//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method

import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius :");
        float Radius = in.nextInt();

        circumference(Radius);
        Area(Radius);

    }
    public static void circumference(float Radius){
        double circumference = 2 * 3.14 * Radius;
        System.out.println("Circumference of the circle is :" + circumference );
    }
    public static void Area(float Radius){
        double  Area = 3.14 * Radius * Radius;
        System.out.println("Area of the circle is :" + Area );
    }

    }
