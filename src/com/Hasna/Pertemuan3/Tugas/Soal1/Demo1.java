package com.Hasna.Pertemuan3.Tugas.Soal1;


public class Demo1 {
    public static void main(String[] args) {
        //Deklarasi Objek class Komplek
        Komplek komplek = new Komplek("30110", "Hogwarts Asri");

        //Deklarasi Objek class Rumah
        Rumah rumah1 = new Rumah("30110A", "Harry Potter", 5);
        Rumah rumah2 = new Rumah("30110B", "Ron Weasley", 4);
        Rumah rumah3 = new Rumah("30110C", "Draco Malfoy", 3);
        Rumah rumah4 = new Rumah("30110D", "Voldemort", 1);

        //memasukan data rumah ke komplek
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());

        //menampilkan data perumahan
        komplek.getData();
    }
}
