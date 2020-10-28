package com.Hasna.Pertemuan2.Tugas.Soal3;

public class Mahasiswa {
    String nama;
    String status;
    int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    void getStatus() {
        System.out.println("nama\t\t\t: " + nama);
        System.out.println("Status\t\t\t: " + status);
        System.out.println("Semester\t\t: " + semester);
    }
}
