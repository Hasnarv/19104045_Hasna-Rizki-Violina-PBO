package com.Hasna.Pertemuan2.Tugas.Soal2;

public class Ikan extends Binatang {
    String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    void getNama() {
        System.out.println("Nama Binatang : " + nama);
    }

    void berenang() {
        System.out.println("Ikan ini juga bisa berenang");
    }
}
