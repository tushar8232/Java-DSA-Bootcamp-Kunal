//Write a program to print the sum of two numbers entered by user by defining your own method.


import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1 = in.nextInt();
        System.out.println("Enter number2 :");
        int num2 = in.nextInt();

        SumOfTwoNumbers(num1,num2);

    }
    public static void SumOfTwoNumbers(int num1, int num2){
        int Sum = num1 + num2;
        System.out.println("Sum of two Numbers is :" + Sum);
    }
}