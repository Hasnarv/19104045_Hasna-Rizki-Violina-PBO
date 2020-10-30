package com.Hasna.Pertemuan3.Tugas.Soal3;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        //mendeklarasikan objek class 'Keluarga'
        Keluarga keluarga = new Keluarga("POTTER FAMILY", "Godric's Hollow");

        //Menambahkan data keluarga
        Ayah ayah = new Ayah(20110, "Harry Potter", 42);
        Ibu ibu = new Ibu(20113, "Ginny Weasley", 40);
        Anak anak1 = new Anak(01, "James Sirius Potter", 13, "Gryffindor's Student");
        Anak anak2 = new Anak(02, "Albus Severus Potter", 11, "Slynterin's Stundent");
        Anak anak3 = new Anak(03, "Lily Luna Potter", 10, "Gryffindor's Student");

        List<Anak> anakList = new ArrayList<>();
        //menambahkan data anak
        anakList.add(anak1);
        anakList.add(anak2);
        anakList.add(anak3);

        //memasukan anggota keluarga
        keluarga.addAnggotaKeluarga(ayah, ibu, anakList);

        //menampilkan data keluarga
        keluarga.getDataKeluarga();

    }
}
