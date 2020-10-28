package com.Hasna.Pertemuan3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Paimon");
        mahasiswa1.setNim(21104001);

        Mahasiswa mahasiswa2 = new Mahasiswa(21104002,"Tabi");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("ACW");
        dosen.setNimMHS(mahasiswa1.getNim());
        dosen.setNimMHS(mahasiswa2.getNim());

        System.out.println("Kode Dosen\t: "+ dosen.getKodeDosen());
        System.out.println("Mangajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- "+ dosen.getNimMhs(i));
        }
    }
}
