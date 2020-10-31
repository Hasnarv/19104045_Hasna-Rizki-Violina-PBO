package com.Hasna.Pertemuan3.Tugas.Soal1;

import java.util.ArrayList;
import java.util.List;

public class Komplek {
    //atribut
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah;
    private List<String> idRumah = new ArrayList<>();

    //constractor
    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    //method untuk menambahkan data rumah
    public void addRumah(String idRumah) {
        this.idRumah.add(jmlRumah, idRumah);
        jmlRumah++;
    }

    //Getter & Setter
    public String getIdKomplek() {
        return idKomplek;
    }

    public void setIdKomplek(String idKomplek) {
        this.idKomplek = idKomplek;
    }

    public String getNamaKomplek() {
        return namaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        this.namaKomplek = namaKomplek;
    }

    public int getJmlRumah() {
        return jmlRumah;
    }

    public void setJmlRumah(int jmlRumah) {
        this.jmlRumah = jmlRumah;
    }

    public void getIdRumah() {
        for (String x : idRumah) {
            System.out.println("ID Rumah\t\t: " + x);
        }
    }

    public void setIdRumah(List<String> idRumah) {
        this.idRumah = idRumah;
    }

    //method data perumahan
    public void getData() {
        System.out.println("\n<=== DATA PERUMAHAN ===>");
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("ID Komplek\t\t: " + getIdKomplek());
        System.out.println("Jumlah Rumah\t: " + getJmlRumah());
        System.out.println("\n\tLIST RUMAH\t:");
        getIdRumah();
    }


}
