package com.Hasna.Pertemuan4.Tugas;

public class Salaried extends Employee {
    private String nama;
    private int nip;
    private float upahMingguan;

    public Salaried(String nama, int nip, float upahMingguan) {
        super("Salaried Employee");
        this.nama = nama;
        this.nip = nip;
        this.upahMingguan = upahMingguan;
    }

    @Override
    protected void getGaji() {
        float gaji = this.upahMingguan;
        System.out.println("Total Gaji " + this.nama + " : Rp " + gaji);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nama\t\t\t\t: " + nama + "\n"
                + "NIP\t\t\t\t\t: " + nip + "\n"
                + "Upah Mingguan\t\t: Rp " + upahMingguan;
    }
}

