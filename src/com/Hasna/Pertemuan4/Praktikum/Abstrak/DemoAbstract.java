package com.Hasna.Pertemuan4.Praktikum.Abstrak;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaan = {
                new Burung("Beo"),
                new Kambing("Etawa"),
                new Kucing("Persia"),
                new Anjim("Cihuahua")
        };

        Binatang kesayangan;
        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan anda\t: " + kesayangan);
        System.out.print("Suaranya\t\t\t\t\t: ");
        kesayangan.suara();
    }
}
