package com.Hasna.Pertemuan2.Tugas.Soal3;

public class Demo {
    public static void main(String[] args) {
        System.out.println("\n=== DATA MAHASISWA & PACARNYA ===\n");
        Pacar pacar = new Pacar("Harry Potter", "Iparnya Ron", 4, "Ginny Weasley", "Lama, sampe nikah");
        pacar.getStatus();
        Mahasiswa mhsPacar = new Pacar("Ron Weasley", "Sahabat jadi Pacar", 4, "Hermione Granger", "Dari Kecil");
        mhsPacar.getStatus();
    }
}
