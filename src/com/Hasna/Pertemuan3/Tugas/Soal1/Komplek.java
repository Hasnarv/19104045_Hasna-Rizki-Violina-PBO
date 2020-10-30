package com.Hasna.Pertemuan3.Tugas.Soal1;

import java.util.ArrayList;
import java.util.List;

public class Komplek {
    //atribut
    private String idKomplek;
    private String namaKomplek;
    private int jmlRumah;
    private List<Rumah> idRumah = new ArrayList<>();

    //constractor
    public Komplek(String idKomplek, String namaKomplek) {
        this.idKomplek = idKomplek;
        this.namaKomplek = namaKomplek;
    }

    //method untuk menambahkan data rumah
    public void addRumah(Rumah rumah) {
        idRumah.add(rumah);
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

    public List<Rumah> getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(List<Rumah> idRumah) {
        this.idRumah = idRumah;
    }

    //method data perumahan
    public void getData() {
        System.out.println("\n<=== DATA PERUMAHAN ===>");
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("ID Komplek\t\t: " + getIdKomplek());
        System.out.println("Jumlah Rumah\t: " + getJmlRumah());
        System.out.println("\n\tLIST RUMAH\t:");
        for (Rumah rumah : idRumah) {
            System.out.println("ID Rumah\t\t: " + rumah.getIdRumah());
            System.out.println("Pemilik Rumah\t: " + rumah.getPemilikRumah());
            System.out.println("Jumlah Orang\t: " + rumah.getJumlahOrang());
            System.out.println();
        }

    }


}
