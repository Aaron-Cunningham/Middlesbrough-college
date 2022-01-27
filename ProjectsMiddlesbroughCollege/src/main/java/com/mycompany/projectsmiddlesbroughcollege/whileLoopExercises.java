
package com.mycompany.projectsmiddlesbroughcollege;

import java.util.Scanner;

public class whileLoopExercises {

    static Scanner sc = new Scanner(System.in);

    public static void practiceOneA() {

        int i = 1;
        System.out.println("Enter a number");
        int num = 10;
        while ((i <= 10) && (num > 0)) {

            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;

        }

    }

    public static void practiceOneB() {
        int i = 1;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while ((i <= 10) && (num > 0)) {

            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;

        }
    }

    public static void practiceOneC() {
        int i = 1;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num < 0) {
            System.out.println("You can only enter postive numbers");
            num = sc.nextInt();
        }
        while ((i <= 10) && (num > 0)) {

            System.out.printf("%d * %d = %d %n", num, i, num * i);
            i++;
        }
    }

    public static void practiceTwoA() {

        for (int i = 5; i < 101; i = i + 5) {
            System.out.println(i);
        }
        for (int i = 100; i > -1; i = i - 5) {
            System.out.println(i);
        }
    }

    public static void practiceThreeB() {
        System.out.println("Enter amount in kitty");
        double kitty = sc.nextDouble();
        System.out.println("Enter amount of hens");
        double hens = sc.nextDouble();

        double brideAmount = (kitty / 8) * 2;//25% of kitty amount
        double hensAmount = (kitty - brideAmount);//taking away bride amount from kitty
        double mothersAmount = (hensAmount / 20) * 2;//getting the 10% for mothers of bride
        double hensAmountOne = (hensAmount - mothersAmount - mothersAmount) / (hens - 3);//calculating amount left over for hens
        hensAmountOne = Math.round(hensAmountOne * 100.0) / 100.0;//making sure the number rounds to two decimal places

        System.out.println("The kitty amount is " + kitty + " the bride will get " + brideAmount + " the two mothers of the bride will get " + mothersAmount + " each and the hens will get " + hensAmountOne + " each");
    }

    public static void practiceThreeA() {

        System.out.println("Input amount in the kitty");
        double kitty = sc.nextDouble();
        System.out.println("Input number of hens");
        double hens = sc.nextDouble();

        double brideAmount = (kitty / 10) * 2;//finding 20% of the kitty amount
        double totalOne = (kitty - brideAmount);//taking that 20% away from kitty amount
        double totalTwo = (totalOne / hens);//dividing the remaining total by the number of hens 
        totalTwo = Math.round(totalTwo * 100.0) / 100.0;//making sure whatever the outcome it rounds to 2 decimal places
        System.out.println("The bride will get £" + brideAmount + " and the hens will get £" + totalTwo + " to spend");

    }

    public static void practiceA() {
        double pi, radius, height, width, volume;
        pi = Math.PI;

        System.out.println("Input radius");
        radius = sc.nextDouble();
        System.out.println("Input height");
        height = sc.nextDouble();
        volume = pi * radius * radius * height;
        volume = Math.round(volume * 100.0) / 100.0;
        System.out.println("the volume is " + volume);
    }
}
