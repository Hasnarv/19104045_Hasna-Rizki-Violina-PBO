package com.Hasna.Pertemuan1.Praktikum;

public class Mahasiswa {
    //Deklarasi variable
    String nama;
    int nim;

    //contractor = nama method yg sama dgn nama classnya
    //constuctor kosong
    public Mahasiswa() {

    }

    //contructor dengan parameter
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
