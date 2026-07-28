//Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class Pythagorean {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pythagorean triplet:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        pythagorean(a,  b,  c);

    }
    public static void pythagorean(int a, int b, int c){
        if ((c)*(c) == (b)*(b) + (a)*(a)){
            System.out.println("Yes it is a triplet");
        }
        else {
            System.out.println("Not a Triplet ");
        }

    }
}
