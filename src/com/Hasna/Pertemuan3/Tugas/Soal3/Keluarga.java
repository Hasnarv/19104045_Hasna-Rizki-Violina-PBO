package com.Hasna.Pertemuan3.Tugas.Soal3;

import java.util.ArrayList;
import java.util.List;

public class Keluarga {
    //atribut
    private List<Anak> anakList = new ArrayList<>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    //constructor
    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    //method untuk menambahkan anggota keluarga
    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, List<Anak> anaks) {
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = anaks;
    }

    //Getter
    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public List<Anak> getAnakList() {
        return anakList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    //method data keluarga
    public void getDataKeluarga() {
        System.out.println("\n\t<==== DATA KELUARGA ====>");
        System.out.println("Nama Keluarga\t: " + getNamaKeluarga());
        System.out.println("Kota Asal\t\t: " + getKotaAsal());
        System.out.println("=======================================");
        System.out.println("\n\tANGGOTA KELUARGA");
        System.out.println("\n\t== AYAH ==");
        System.out.println("ID Ayah\t\t: " + getAyah().getIdAyah());
        System.out.println("Nama Ayah\t: " + getAyah().getNamaAyah());
        System.out.println("Umur Ayah\t: " + getAyah().getUmurAyah());
        System.out.println("\n\t== IBU ==");
        System.out.println("ID Ibu\t\t: " + getIbu().getIdIbu());
        System.out.println("Nama Ibu\t: " + getIbu().getNamaIbu());
        System.out.println("Umur Ibu\t: " + getIbu().getUmurIbu());
        System.out.println("\n\t== ANAK ==");
        for (Anak anak : anakList) {
            System.out.println("ID Anak\t\t: " + anak.getIdAnak());
            System.out.println("Nama Anak\t: " + anak.getNamaAnak());
            System.out.println("Umur Anak\t: " + anak.getUmurAnak());
            System.out.println("Status Anak\t: " + anak.getStatusAnak());
            System.out.println();
        }
    }
}
