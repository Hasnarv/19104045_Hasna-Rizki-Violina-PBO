package com.Hasna.Pertemuan4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket a = new Paket("Harry Potter And The Philosopher's Stone", "J.K. Rowling", 120000, "4GB", 50000);

        a.hitungHargaPaket();
        a.cetakPaket();
    }
}
