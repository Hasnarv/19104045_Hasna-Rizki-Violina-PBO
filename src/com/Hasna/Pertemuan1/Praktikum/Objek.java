package com.Hasna.Pertemuan1.Praktikum;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        //memanggil method yg di class mahasiswa dan mengisi objeknya
        mahasiswaTanpa.setNama("Hasna");
        mahasiswaTanpa.setNim(19104045);
        //Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi objek dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Rizki", 12345678);
        //Output
        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }
}
