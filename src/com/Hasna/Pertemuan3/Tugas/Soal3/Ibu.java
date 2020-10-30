package com.Hasna.Pertemuan3.Tugas.Soal3;

public class Ibu {
    //atribut
    private int idIbu;
    private String namaIbu;
    private int umurIbu;

    //constructor
    public Ibu(int idIbu, String namaIbu, int umurIbu) {
        this.idIbu = idIbu;
        this.namaIbu = namaIbu;
        this.umurIbu = umurIbu;
    }

    //Getter
    public int getIdIbu() {
        return idIbu;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public int getUmurIbu() {
        return umurIbu;
    }
}
