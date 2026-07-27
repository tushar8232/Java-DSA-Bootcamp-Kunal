//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Age of the person:");
        int age = in.nextInt();

        EligibleToVote(age);

    }


    public static void EligibleToVote(int age){
        if (age >= 18 ){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }
}