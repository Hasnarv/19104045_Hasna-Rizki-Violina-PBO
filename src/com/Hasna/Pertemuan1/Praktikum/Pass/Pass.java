package com.Hasna.Pertemuan1.Praktikum.Pass;

public class Pass {
    public static void main(String[] args) {
        int nomor1, nomor2; //tipe data primitif
        TestPass pass = new TestPass(50, 100); //Deklarasi object
        nomor1 = 10;
        nomor2 = 20;

        //Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("nomor1 = " + nomor1);
        System.out.println("nomor2 = " + nomor2);

        pass.calculate(nomor1, nomor2);
        System.out.println("Nilai sesudah passed by value: ");
        System.out.println("nomor1 = " + nomor1);
        System.out.println("nomor2 = " + nomor2);

        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference");
        System.out.println("pass.nomor1 = " + pass.nomor1);
        System.out.println("pass.nomor2 = " + pass.nomor2);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("pass.nomor1 = " + pass.nomor1);
        System.out.println("pass.nomor2 = " + pass.nomor2);

    }
}
