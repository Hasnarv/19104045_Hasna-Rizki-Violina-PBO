package com.Hasna.Pertemuan4.Praktikum.Abstrak;

public class Kucing extends Binatang {
    private String nama;

    public Kucing(String nama) {
        super("Kucing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("Mengeong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
