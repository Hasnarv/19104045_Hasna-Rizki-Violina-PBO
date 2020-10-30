package com.Hasna.Pertemuan3.Tugas.Soal3;

public class Ayah {
    //atribut
    private int idAyah;
    private String namaAyah;
    private int umurAyah;

    //constructor
    public Ayah(int idAyah, String namaAyah, int umurAyah) {
        this.idAyah = idAyah;
        this.namaAyah = namaAyah;
        this.umurAyah = umurAyah;
    }

    //Getter
    public int getIdAyah() {
        return idAyah;
    }

    public String getNamaAyah() {
        return namaAyah;
    }

    public int getUmurAyah() {
        return umurAyah;
    }
}
