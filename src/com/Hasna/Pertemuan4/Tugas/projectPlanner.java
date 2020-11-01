package com.Hasna.Pertemuan4.Tugas;

public class projectPlanner extends Employee {
    private String nama;
    private int nip;
    private float gajiPokok;
    private float komisi;
    private float totHasilProyek;

    public projectPlanner(String nama, int nip, float gajiPokok, float komisi, float totHasilProyek) {
        super("Projrct Planner");
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totHasilProyek = totHasilProyek;
    }

    @Override
    protected void getGaji() {
        float gaji = (this.gajiPokok + (this.komisi * this.totHasilProyek)) - ((this.gajiPokok * 5) / 100);
        System.out.println("Total Gaji " + this.nama + " : Rp " + gaji);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nama\t\t\t\t: " + nama + "\n"
                + "NIP\t\t\t\t\t: " + nip + "\n"
                + "Gaji Pokok\t\t\t: Rp " + gajiPokok + "\n"
                + "Komisi\t\t\t\t: RP " + komisi + "\n"
                + "Total Hasil Proyek\t: Rp " + totHasilProyek;
    }

}

