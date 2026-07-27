//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num1 = in.nextInt();
        int Num2 = in.nextInt();

        EvenOdd(Num1);
        EvenOdd(Num2);
    }

    public static void EvenOdd(int num1){
        if(num1 % 2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}