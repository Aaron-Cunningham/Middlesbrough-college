/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectsmiddlesbroughcollege;






import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ifAndElseIfStatements {

    static Scanner sc = new Scanner(System.in);


    public static void studentsGrades() {

        System.out.println("Input the students grade");
        int grade = sc.nextInt();

        if (grade <= 49) {
            System.out.println("Fail");
        } else if ((grade >= 50) && (grade <= 59)) {
            System.out.println("Pass");
        } else if ((grade >= 60) && (grade <= 69)) {
            System.out.println("Merit");
        } else if (grade >= 70) {
            System.out.println("Distinction");
        }

    }

    public static void policeSpeedCamera() {
        System.out.println("Input speed of car");
        int speed = sc.nextInt();

        if (speed >= 71) {
            System.out.println("Issue fine");
        } else {
            System.out.println("No fine");
        }

    }

    public static void policeSpeedCameraUpdated() {
        System.out.println("Input speed");
        int speed = sc.nextInt();

        if (speed >= 76) {
            System.out.println("issue fine");
        } else if ((speed >= 71) && (speed >= 70)) {
            System.out.println("Issue warning");
        } else {
            System.out.println("No action required");
        }
    }

    public static void hoursSlept() {
        int hoursSleptMonday;
        int hoursSleptTuesdayy;
        int hoursSleptWednesday;
        int hoursSleptThursday;
        int hoursSleptFriday;
        int hoursSleptSaturdayday;
        int hoursSleptSunday;

        int total;

        System.out.println("How many hours did you sleep Monday?");
        hoursSleptMonday = sc.nextInt();
        System.out.println("How many hours did you sleep tuesday?");
        hoursSleptTuesdayy = sc.nextInt();
        System.out.println("How many hours did you sleep wednesday?");
        hoursSleptWednesday = sc.nextInt();
        System.out.println("How many hours did you sleep Thursday?");
        hoursSleptThursday = sc.nextInt();
        System.out.println("How many hours did you sleep Friday?");
        hoursSleptFriday = sc.nextInt();
        System.out.println("How many hours did you sleep Saturday?");
        hoursSleptSaturdayday = sc.nextInt();
        System.out.println("How many hours did you sleep Sunday?");
        hoursSleptSunday = sc.nextInt();

        total = hoursSleptMonday + hoursSleptTuesdayy + hoursSleptWednesday + hoursSleptThursday + hoursSleptFriday + hoursSleptSaturdayday + hoursSleptSunday;

        System.out.println("You have slept a total of " + total + " hours this week!");
    }

    public static void mobileBill() {

        long phoneNum;
        String userName;
        String userNetwork;
        int numOfMinsUsed;
        int numOfTextsSent;
        double totalMinutesCost;
        double totalTextCost;
        double allTogetherTotal;
        double vat;

        System.out.println("Input your name");
        userName = sc.nextLine();
        System.out.println("Input your network");
        userNetwork = sc.nextLine();
        System.out.println("Input mobile phone number");
        phoneNum = sc.nextLong();
        System.out.println("How many minutes have you used?");
        numOfMinsUsed = sc.nextInt();
        System.out.println("How many texts have you sent?");
        numOfTextsSent = sc.nextInt();

        totalTextCost = numOfTextsSent * 0.05;

        totalMinutesCost = numOfMinsUsed * 0.10;

        allTogetherTotal = totalMinutesCost + totalTextCost;

        vat = allTogetherTotal * 1.20;

        vat = Math.round(vat * 100.0) / 100.0;

        System.out.println(userName);
        System.out.println(userNetwork);
        System.out.println(phoneNum);
        System.out.println("Your bill total is " + vat);

    }

    public static void date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("This is the currebnt time right now " + dtf.format(now));

    }

    

  



}

