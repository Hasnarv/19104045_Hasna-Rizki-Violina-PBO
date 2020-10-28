package com.Hasna.Pertemuan3.Praktikum.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("2110","Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Gundala",21104001);
        Mahasiswa mahasiswa2 = new Mahasiswa("Putra",21104002);
        Mahasiswa mahasiswa3 = new Mahasiswa("Petir",21104003);

        //list mahasiswa dari class demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Kucing",21104004));

        //untuk copas daata dari list mahasiswa class "demoJurusan" ke "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);

        // untuk masukan data Mahasiswa langung ke class Jurusan
        jurusan.addMahasiswa(mahasiswa3);
        jurusan.printDataJurusan();
    }
}
