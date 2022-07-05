package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(in);
        MathGame mathGame = new MathGame();
        ArrayList<MathGame> arrayList = new ArrayList<>();

        String name = null;
        int right = 0;
        int wrong = 0;

        int h = 0;
        while (true) {
            System.out.println();
            System.out.println("[1] start game");
            System.out.println("[2] statistic ");
            System.out.println("[3] rating ");
            int a = scanner.nextInt();
            switch (a) {


                case 1 -> {
                    System.out.println("enter name: ");
                    scanner = new Scanner(in);
                    name = scanner.nextLine();
                    for (int i = 0; i < 5; i++) {


                        int num1 = random.nextInt(100);
                        int num2 = random.nextInt(100);
                        int amal = random.nextInt(4);
                        mathGame.Math(num1, num2, amal);


                        scanner = new Scanner(in);
                        int answer = scanner.nextInt();

                        if (answer == mathGame.res) {
                            right++;
                        } else {
                            wrong++;
                        }

                    }

                    arrayList.add(new MathGame(name, right, wrong));
                    right = 0;
                }


                case 2 -> {
                    arrayList.sort(new MathGame());
                    arrayList.forEach(mathGame1 -> {
                        System.out.println(mathGame1.getName());
                        System.out.println("right answers: " + mathGame1.getRight());
                        System.out.println("wrong answers: " + mathGame1.getWrong());
                    });
                }
                case 3 -> {
                    arrayList.sort(mathGame);

                    arrayList.forEach(mathGame1 -> {
                        System.out.println(mathGame1.getName() + ":" + " " + mathGame1.getRight());
                    });
                }
            }
        }


    }
}


