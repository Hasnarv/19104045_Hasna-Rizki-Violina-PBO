package com.Hasna.Pertemuan3.Tugas.Soal1;


import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //Deklarasi Objek class Komplek
        Komplek komplek = new Komplek("30110", "Hogwarts Asri");

        //membuat rumah baru
        Rumah rumah1 = new Rumah("30110A", "Harry Potter", 5);
        Rumah rumah2 = new Rumah("30110B", "Ron Weasley", 4);
        Rumah rumah3 = new Rumah("30110C", "Draco Malfoy", 3);
        Rumah rumah4 = new Rumah("30110D", "Voldemort", 1);

        //menambahkan data rumah ke list
        List<Rumah> rumahList = new ArrayList<>();
        rumahList.add(rumah1);
        rumahList.add(rumah2);
        rumahList.add(rumah3);

        //menampilkan jumlah rumah
        komplek.setJmlRumah(rumahList.size() + 1);

        //meng copy data dari list rumah class 'Demo1' ke class 'Komplek'
        komplek.setIdRumah(rumahList);

        //menambahkan data rumah langsung ke class 'Komplek'
        komplek.addRumah(rumah4);

        //menampilkan data perumahan
        komplek.getData();


    }
}
