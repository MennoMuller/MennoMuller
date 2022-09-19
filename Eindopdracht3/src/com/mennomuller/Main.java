package com.mennomuller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int lucas1 = 2;
    static int lucas2 = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        while (true) {

            try {
                System.out.print("Geef een natuurlijk getal: ");
                number = input.nextInt();
                if (number < 0) {
                    System.out.println("Getal negatief, fout");
                } else if (number > 45) {
                    System.out.println("Getal te groot, past niet");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Dat is geen natuurlijk getal.");
                input.next();
            }
        }
        System.out.println("De eerste " + number + " Lucas-getallen:");
        StringBuilder lucasSeq = new StringBuilder();
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                lucasSeq.append("2");
            } else if (i == 1) {
                lucasSeq.append(" 1");
            } else {
                lucasSeq.append(" ").append(lucas());
            }
        }
        System.out.println(lucasSeq);
    }

    public static int lucas() {
        int lucas3 = lucas1 + lucas2;
        lucas1 = lucas2;
        lucas2 = lucas3;
        return lucas3;
    }
}
