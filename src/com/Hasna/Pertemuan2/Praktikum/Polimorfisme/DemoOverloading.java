package com.Hasna.Pertemuan2.Praktikum.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        //Deklarasi Objek
        Lagu lagu1 = new Lagu("Ambilkan Bulan Bu");
        Lagu lagu2 = new Lagu("Halu", "Feby");

        //Memanggil method
        lagu1.getDataLagu();
        lagu2.getDataLagu();
        ;
    }
}
