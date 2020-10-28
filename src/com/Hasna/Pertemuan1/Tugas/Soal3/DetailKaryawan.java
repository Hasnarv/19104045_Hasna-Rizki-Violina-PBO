package com.Hasna.Pertemuan1.Tugas.Soal3;

public class DetailKaryawan {
    //Deklarasi Variable
    private String nama = "HARRY POTTER";
    private String ttl = "Godric's Hollow, 31 Juli 1980";
    private String jnsKelamin = "Pria";
    private String alamat = "Privet Drive No.4, Little Whinging";
    private String jabatan = "Auror";
    private int noTlp = 23237878;

    //Class Main
    public static void main(String[] args) {
        //deklarasi Objek
        DetailKaryawan detailKaryawan = new DetailKaryawan();

        //Output
        System.out.println("\t\t<-----DATA KARYAWAN----->\n");
        System.out.println("Data Anda : ");
        detailKaryawan.data(); //memanggil method data


    }

    //Method
    void data() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("TTL\t\t\t\t: " + ttl);
        System.out.println("Jenis Kelamin\t: " + jnsKelamin);
        System.out.println("Alamat\t\t\t: " + alamat);
        System.out.println("Jabatan\t\t\t: " + jabatan);
        System.out.println("No. Telepon\t\t: " + noTlp);
    }
}
