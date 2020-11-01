package com.Hasna.Pertemuan4.Tugas;

public class Commision extends Employee {
    private String nama;
    private int nip;
    private float gajiPokok;
    private float komisi;
    private float totJual;

    public Commision(String nama, int nip, float gajiPokok, float komisi, float totJual) {
        super("Commision Employee");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totJual = totJual;
    }

    @Override
    protected void getGaji() {
        float gaji = this.gajiPokok + (this.komisi * this.totJual);
        System.out.println("Total Gaji " + this.nama + " : Rp " + gaji);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nama\t\t\t\t: " + nama + "\n"
                + "NIP\t\t\t\t\t: " + nip + "\n"
                + "Gaji Pokok\t\t\t: Rp " + gajiPokok + "\n"
                + "Komisi\t\t\t\t: Rp " + komisi + "\n"
                + "Total Penjualan\t\t: Rp " + totJual;
    }

}
