package com.Hasna.Pertemuan2.Tugas.Soal1;

public class DemoClub {
    public static void main(String[] args) {
        //Deklarasi Objek
        Club club1 = new Club();
        Club club2 = new Club("Harry");
        Club club3 = new Club("Harry", "Mengalahkan Slynterin");
        Club club4 = new Club("Harry", 1945, "Quidditch Stadium");
        Club club5 = new Club("Harry", 1945, "Quidditch Stadium", 1, "Mengalahkan Slynterin");

        //Memanggil method
        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }

}
