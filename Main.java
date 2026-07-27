//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user

import java.util.Scanner;

public class Main {
    static void main(String[] main) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number a:");
        int a = in.nextInt();
        System.out.println("Enter second Number b:");
        int b = in.nextInt();
        System.out.println("Enter Third Number c:");
        int c  = in.nextInt();

        MaximumNumber(a,b,c);
        MinimumNumber(a,b,c);


    }
    public static void MaximumNumber(int a, int b, int c) {
        int max = Math.max(a,Math.max(b,c));
        System.out.println("Maximum Number is :"+ max);
    }
    public static void MinimumNumber(int a, int b, int c){
        int min = Math.min(a, Math.min(b,c));
        System.out.println("Minimum Number is :"+ min);
    }

}
