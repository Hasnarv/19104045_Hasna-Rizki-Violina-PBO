package com.Hasna.Pertemuan2.Praktikum.Polimorfisme;

public class Lagu {
    public String judul;
    public String pencipta;

    //Overloading : method nama sama, parameter beda
    //overloading
    public Lagu(String judul) {
        this.judul = judul;
        this.pencipta = "Tidak diketahui";
    }

    //overloading
    public Lagu(String judul, String pencipta) {
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void getDataLagu() {
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
        System.out.println();
    }
}
