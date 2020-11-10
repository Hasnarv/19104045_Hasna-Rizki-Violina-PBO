package com.Hasna.Pertemuan5.Praktikum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Study_Case {
    public static void main(String[] args) {
        System.out.println("Input Array Length\t: ");
        int[] array = new int[intInputMethod()];

        System.out.println("Masukkan data\t:");
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println("Indeks ke-" + i + "\t: ");
                array[i] = intInputMethod();
            } catch (InputMismatchException e) {
                System.out.println("Masukkan Angka !!!");
                i++;
            }

        }
        System.out.println("\nOutput\t: ");
        for (int x : array) {
            System.out.println("Data\t " + x);
        }
    }

    public static int intInputMethod() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
