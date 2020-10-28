package com.Hasna.Pertemuan1.Tugas.Soal2;

import java.util.Scanner;

public class DemoNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t<===== PENDAFTARAN MAHASISWA BARU =====>\n");

        //Input data mahasiswa
        System.out.println("Silahkan isi data diri Anda dibawah ini,");
        System.out.print("Nama\t\t\t: ");
        String nama = scanner.nextLine();
        System.out.print("TTL\t\t\t\t: ");
        String ttl = scanner.nextLine();
        System.out.print("Asal Sekolah\t: ");
        String aslsekolah = scanner.nextLine();
        System.out.print("Asal Daerah\t\t: ");
        String asldaerah = scanner.nextLine();
        System.out.print("Email\t\t\t: ");
        String email = scanner.nextLine();
        System.out.println("Program Studi Pilihan :");
        System.out.print("Pilihan 1\t\t: ");
        String pil1 = scanner.nextLine();
        System.out.print("Pilihan 2\t\t: ");
        String pil2 = scanner.nextLine();

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama(nama);
        mhs.setTtl(ttl);
        mhs.setAsalSekolah(aslsekolah);
        mhs.setAsalDaerah(asldaerah);
        mhs.setEmail(email);
        mhs.setPil1(pil1);
        mhs.setPil2(pil2);

        //Output
        System.out.println();
        System.out.println("DATA ANDA");
        System.out.println("Nama\t\t\t: " + mhs.getNama());
        System.out.println("TTL\t\t\t\t: " + mhs.getTtl());
        System.out.println("Asal Sekolah\t: " + mhs.getAsalSekolah());
        System.out.println("Asal Daerah\t\t: " + mhs.getAsalDaerah());
        System.out.println("Email\t\t\t: " + mhs.getEmail());
        System.out.println("Program Studi Pilihan :");
        System.out.println("Pilihan 1\t\t: " + mhs.getPil1());
        System.out.println("Pilihan 2\t\t: " + mhs.getPil2());

        System.out.println("\n\t\tPENDAFTARAN SELESAI\t\t");
        System.out.println("Jadwal ujian akan kami kirim ke email Anda");
    }

}
