package com.Hasna.Pertemuan3.Tugas.Soal2;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private String id;
    private String nama;
    private List<Planet> planetList = new ArrayList<>();

    public SolarSystem(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void getTotalMember() {
        System.out.println("Jumlah Planet\t: " + planetList.size());
    }

    public void getPlanets() {
        for (Planet planet : planetList) {
            System.out.println("Nama\t\t\t: " + planet.getNamaPlanet());
            System.out.println("Urutan Planet\t: Ke- " + planet.getUrutanPlanet());
            System.out.println("ID\t\t\t\t: " + planet.getIdPlanet());
            System.out.println();
        }
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void getData() {
        System.out.println("\n\t<=== SOLAR SYSTEM ===>\n");
        System.out.println("Nama Galaksi\t: " + getNama());
        System.out.println("ID\t\t\t\t: " + getId());
        getTotalMember();
        System.out.println("\n\tLIST PLANET :");
        getPlanets();
    }
}
