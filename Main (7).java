//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks of student out of 100:");

        int Marks = in.nextInt();

        DisplayGrade(Marks);
    }
    public static void DisplayGrade( int Marks){
        if ( Marks > 91  && Marks < 100) {
            System.out.println("Grade is AA");
        }
        else if(Marks > 81 && Marks < 90) {
        System.out.println("Grade is AB");
        }
        else if(Marks > 71 && Marks < 80) {
            System.out.println("Grade is BB");
        }
        else if(Marks > 61 && Marks < 70) {
            System.out.println("Grade is BC");
        }
        else if(Marks > 51 && Marks < 60) {
            System.out.println("Grade is CC");
        }
        else if(Marks > 41 && Marks < 50) {
            System.out.println("Grade is DD");
        }
        else {
            System.out.println("Fail");
        }
    }

}
