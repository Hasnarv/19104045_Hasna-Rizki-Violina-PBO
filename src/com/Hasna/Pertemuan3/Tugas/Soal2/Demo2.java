package com.Hasna.Pertemuan3.Tugas.Soal2;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem("3011", "GALAKSI BIMASAKTI");

        Planet planet1 = new Planet(301101, 1, "Merkurius");
        Planet planet2 = new Planet(301102, 2, "Venus");
        Planet planet3 = new Planet(301103, 3, "Bumi");
        Planet planet4 = new Planet(301103, 3, "Mars");
        Planet planet5 = new Planet(301103, 3, "Jupiter");
        Planet planet6 = new Planet(301103, 3, "Saturnus");
        Planet planet7 = new Planet(301103, 3, "Uranus");
        Planet planet8 = new Planet(301103, 3, "Neptunus");

        List<Planet> planetList = new ArrayList<>();

        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);
        planetList.add(planet8);

        solarSystem.setPlanetList(planetList);
        solarSystem.getData();
    }
}
