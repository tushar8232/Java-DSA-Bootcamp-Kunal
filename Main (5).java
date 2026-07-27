//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = in.nextInt();

        ProductOfTwoNumbers(num1, num2);
    }
    public static void ProductOfTwoNumbers(int num1, int num2){
        int product = num1 * num2;
        System.out.println("Product of two numbers is :" + product);
    }
}