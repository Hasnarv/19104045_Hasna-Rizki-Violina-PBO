package com.Hasna.Pertemuan2.Tugas.Soal3;

public class Pacar extends Mahasiswa {
    String namaPacar;
    String lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    @Override
    void getStatus() {
        super.getStatus();
        System.out.println("Nama Pacar\t\t: " + namaPacar);
        System.out.println("Lama Hubungan\t: " + lamaHubungan);
        System.out.println();
    }
}
