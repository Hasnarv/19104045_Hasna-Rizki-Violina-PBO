package com.Hasna.Pertemuan3.Tugas.Soal1;

public class Rumah {
    //atribut
    private String idRumah;
    private String pemilikRumah;
    private int jumlahOrang;

    //constractor
    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    //getter
    public String getIdRumah() {
        return idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

}
