package com.Hasna.Pertemuan2.Tugas.Soal1;

public class Club {
    public String nama, stadion, deskripsi;
    public int tahunBerdiri, juaraUcl;

    public Club() {
        this.nama = "Harry";
        this.tahunBerdiri = 1945;
        this.stadion = "Quidditch Stadium";
        this.juaraUcl = 1;
        this.deskripsi = "Mengalahkan Slynterin";
    }

    public Club(String nama) {
        this.nama = nama;
        this.tahunBerdiri = 1945;
        this.stadion = "Quidditch Studium";
        this.juaraUcl = 1;
        this.deskripsi = "Mengalahkan Slynterin";
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.tahunBerdiri = 1945;
        this.stadion = "Quidditch Studium";
        this.juaraUcl = 1;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = 1;
        this.deskripsi = "Mengalahkan Slynterin";
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Stadion\t\t\t: " + stadion);
        System.out.println("Juara Ucl\t\t: " + juaraUcl);
        System.out.println("Deskripsi\t\t: " + deskripsi);
        System.out.println();
    }
}
