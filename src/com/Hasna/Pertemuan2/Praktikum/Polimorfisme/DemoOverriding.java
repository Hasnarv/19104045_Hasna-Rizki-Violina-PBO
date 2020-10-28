package com.Hasna.Pertemuan2.Praktikum.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        //Deklarasi Objek
        X superClass = new X();
        Y subClass = new Y();

        //Memanggil method
        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
