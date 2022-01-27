package com.mycompany.projectsmiddlesbroughcollege;

import java.util.Scanner;

public class SwitchesAndWhileLoopsAndMenuSystem {

    static double length, width, height, radius, pi, answer, roundedAnswer;

    static Scanner sc = new Scanner(System.in);



    public static void menu() {
        int option = 0;

        while (option == 0) {
            System.out.println("Select 1 for cylinder");
            System.out.println("Select 2 for rectangle area");
            System.out.println("Select 3 for volume calculator");
            System.out.println("Select 4 to count to 100");
            System.out.println("Select 5 to exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    cylinder();
                    break;
                case 2:
                    areaRectangle();
                    break;
                case 3:
                    volume();
                    break;
                case 4:
                    counting();
                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    option = 0;
                    break;
            }
        }

    }

    public static void areaRectangle() {
        length = 20;
        width = 5;
        answer = width * length;
        System.out.println("The answer is " + answer);

    }

    public static void volume() {
        length = 10;
        height = 10;
        width = 10;
        answer = length * height * width;
        System.out.println(answer);

    }

    public static void cylinder() {
        pi = Math.PI;
        System.out.println("Input radius");
        radius = sc.nextDouble();
        System.out.println("Input height");
        height = sc.nextDouble();

        answer = (pi * radius * radius * height);
        roundedAnswer = Math.round(answer * 100.0) / 100.0;

        System.out.println("The answer is " + roundedAnswer);
    }

    public static double cylinderT(double radius, double height, double pi) {
        return pi * radius * radius * height;
    }

    public static void counting() {
        for (int i = 0; i < 101; i = i + 1) {
            System.out.println(i);
        }
    }
}
