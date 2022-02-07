package com.mycompany.projectsmiddlesbroughcollege;

import java.util.Arrays;
import java.util.Scanner;

public class javaChallenges {

    static Scanner sc = new Scanner(System.in);

    protected static void printArray() {
        int[] items = {3, 2, 5, 6, 9};

        System.out.println("There are " + items.length + " items");
        System.out.println("The items are " + Arrays.toString(items));
    }

    public static void oddOrEven() {
        int num1;

        System.out.println("Enter a number to check if it's odd or even");
        num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }

    public static void myName() {
        String firstName;
        String lastName;
        System.out.println("Enter First name");
        firstName = sc.nextLine();
        System.out.println("Enter last name");
        lastName = sc.nextLine();
        System.out.println("Your name is " + firstName + " " + lastName);

    }

    public static String name(String firstName, String lastName) {

        System.out.println(firstName + " " + lastName);
        return null;
    }

    public static void fibonacciSeqence() {
        int num1 = 0;
        int num2 = 1;
        int num3 = 10;
        int i = 10;

        for (i = 2; i < 12; i++) {

            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void starArray() {
        int numbers;
        int[] items = {3, 2, 5, 6, 9};
        for (int idx = 0; idx < items.length; idx++) {
            System.out.println(idx + ":");
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.println("*");/*the listed numbers will come out as stars remove this line
                                        to remove the stars */

            }

        }

    }

    public static void gradesStats() {
        System.out.println("Enter the grade of student ");
        double stu1 = sc.nextDouble();
        System.out.println("Enter the grade of student ");
        double stu2 = sc.nextDouble();
        System.out.println("Enter the grade of student ");
        double stu3 = sc.nextDouble();
        System.out.println("Enter the grade of student ");
        double stu4 = sc.nextDouble();
        System.out.println("Enter the grade of student ");
        double stu5 = sc.nextDouble();

        double av = stu1 + stu2 + stu3 + stu4 + stu5;
        double average = av / 5;

        System.out.println("The average grade is " + average);

    }

    public static void printDayWord() {

        int option = 0;

        while (option == 0) {
            System.out.println("Select the day you want:");

            System.out.println("1 for Monday");
            System.out.println("2 for Tuesday");
            System.out.println("3 for Wednesday");
            System.out.println("4 for Thursday");
            System.out.println("5 for Friday");
            System.out.println("6 for Saturday");
            System.out.println("7 for Sunday");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    option = 0;
                    break;

            }
        }

    }

    public static void sumAverageRunningInt() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            System.out.println(number);

        }

    }

}
