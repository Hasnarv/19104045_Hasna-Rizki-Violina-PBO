package com.Hasna.Pertemuan4.Praktikum.Abstrak;

public class Anjim extends Binatang {
    private String nama;

    public Anjim(String nama) {
        super("Anjing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println(" Menggonggong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
