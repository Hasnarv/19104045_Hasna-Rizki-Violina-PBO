package com.Hasna.Pertemuan2.Tugas.Soal2;

public class Demo {
    public static void main(String[] args) {
        Binatang superBinatang = new Binatang();
        Burung subBurung = new Burung("Burung");
        Ikan subIkan = new Ikan("Ikan");
        Kucing subKucing = new Kucing("Kucing");

        System.out.println("\n\t==Sifat Umum Binatang==");
        superBinatang.makan("Binatang");
        superBinatang.tidur("Binatang");

        System.out.println("\n\t==Sifat Burung==");
        subBurung.getNama();
        subBurung.makan("Burung");
        subBurung.tidur("Burung");
        subBurung.terbang();

        System.out.println("\n\t==Sifat Ikan==");
        subIkan.getNama();
        subIkan.makan("Ikan");
        subIkan.tidur("Ikan");
        subIkan.berenang();

        System.out.println("\n\t==Sifat Kucing==");
        subKucing.getNama();
        subKucing.makan("Kucing");
        subKucing.tidur("Kucing");
        subKucing.meong();
    }
}
