package com.Hasna.Pertemuan1.Tugas.Soal1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menginputkan suhu
        System.out.println("\t\t<-----MASUKKAN SUHU----->");
        System.out.print("Masukkan Suhu C : ");
        int c = scanner.nextInt();
        System.out.print("Masukkan Suhu F: ");
        int f = scanner.nextInt();
        System.out.print("Masukkan Suhu K: ");
        int k = scanner.nextInt();
        System.out.print("Masukkan Suhu R: ");
        int r = scanner.nextInt();

        System.out.println();
        System.out.println("\t\t<<-----KONVERSI SUHU----->>");
        //sebelum dikonversi
        System.out.println("Suhu Sebelum Dikonversi :");
        KonversiSuhu konv = new KonversiSuhu(c, f, k, r);
        System.out.println("C = " + konv.a);
        System.out.println("F = " + konv.b);
        System.out.println("K = " + konv.c);
        System.out.println("R = " + konv.d);
        System.out.println();
        //sesudah dikonversi
        System.out.println("Suhu Sesudah Dikonversi :");
        konv.konversi(konv); //memanggil method konversi
        System.out.println("C -> F = " + konv.a + " F");
        System.out.println("F -> K = " + konv.b + " K");
        System.out.println("K -> R = " + konv.c + " R");
        System.out.println("R -> C = " + konv.d + " C");


    }
}
