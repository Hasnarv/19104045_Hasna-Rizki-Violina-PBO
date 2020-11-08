package com.Hasna.Pertemuan5.Tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pelanggan {
    public static void main(String[] args) {
        int[] array = new int[10]; //menentukan panjang maksimal array
        //input jumlah pengunjung
        System.out.println("\n<--- PELANGGAN --->");
        System.out.print("Jumlah Pengunjung: ");
        int abc = getPengunjung();
        System.out.println("---------------------------");
        try {
            if (abc <= 10) {
                //jika pelanggan yang diinputkan kurang dari 10 orang
                System.out.println("Masukkan Data Pengunjung : ");
                for (int i = 0; i < abc; i++) {
                    try {
                        System.out.print("UID\t: ");
                        array[i] = getPengunjung();
                        System.out.println("Data ke-" + i + "\t: " + array[i] + " Terdaftar !\n");
                    } catch (InputMismatchException e) {
                        System.out.println("Masukkan Angka !!");
                        i--;
                    }
                }
            } else {
                //jika pelanggan yang diinputkan lebih dari 10 orang
                throw new Exception("Maksimal 10 Pelanggan !!");
            }

            //melihat data pelanggan yang telah diinputkan
            System.out.println("---------------------------");
            System.out.println("\nLihat Data Pengunjung\t: ");
            boolean menu = false;
            do {
                System.out.print("\nIndeks\t: ");
                int u = getPengunjung();
                System.out.println("Data ke-" + u + "\t: " + array[u] + "\n");

                System.out.print("Lihat lagi? " + "\n"
                        + "(Yes == 0) / (No == 1) : ");
                int masukan = getPengunjung();
                if (masukan == 0) {
                    continue;
                } else {
                    break;
                }
            } while (!menu);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static int getPengunjung() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}

