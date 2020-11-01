package com.Hasna.Pertemuan4.Tugas;

import java.util.Random;

public class demoEmployee {
    public static void main(String[] args) {
        Employee[] employee = {
                new Salaried("Tinky Winky", 2011301, 5000000),
                new Commision("Dipsy", 2011302, 3000000, 200000, 100000),
                new projectPlanner("Laa Laa", 2011303, 1000000, 200000, 100000)
        };

        Employee karyawan;

        Random pilihan = new Random();
        karyawan = employee[pilihan.nextInt(employee.length)];

        System.out.println("\n<==== DATA GAJI KARYAWAN ====>\n" + karyawan);
        System.out.println();
        karyawan.getGaji();
    }
}
