
package com.mycompany.projectsmiddlesbroughcollege;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ForAndWhileLoops {
    static Scanner sc = new Scanner(System.in);
    
    
    public static void date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("This is the currebnt time right now " + dtf.format(now));

    }

    public static void whileLoop() {
        String answer = "";
        while (!"10".equals(answer)) {
            System.out.println("What is 5+5?");
            answer = sc.next();
        }
        System.out.println("Correct!");
        {
            while (!"50".equals(answer)) {
                System.out.println("How many states does the USA have?");
                answer = sc.next();
            }
            System.out.println("Correct!");
        }
        while (!"Ottawa".equals(answer)) {
            System.out.println("What is the capital of Canada?");
            answer = sc.next();
        }
        System.out.println("Correct!");
        {
            System.out.println("That is the end of the quiz!");
        }
    }

    public static void forLoop() {
        for (int i = 0; i < 101; i = i + 1) {
            System.out.println(i);
        }

        for (int num = 100; num > -1; num = num - 5) {
            System.out.println(num);
        }
    }

    public static void forLoopi() {
        int i;
        for (i = 0; i < 101; i = i + 5) {
            System.out.println(i);
        }
    }
}
