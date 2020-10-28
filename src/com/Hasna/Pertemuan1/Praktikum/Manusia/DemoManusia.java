package com.Hasna.Pertemuan1.Praktikum.Manusia;

public class DemoManusia {
    public static void main(String[] args) {
        //Array of Object
        Manusia arrayManusia[] = new Manusia[3];

        //constructor pertama
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Harry Potter");
        manusia1.setUmur(20);

        //constructor kedua
        Manusia manusia2 = new Manusia("Hermione");

        //constructor ketiga
        Manusia manusia3 = new Manusia("Ron", 20);

        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia) {
            System.out.println("Character");
            System.out.println("Nama\t: " + x.getNama());
            System.out.println("Umur\t: " + x.getUmur());
            System.out.println();
        }
    }
}
