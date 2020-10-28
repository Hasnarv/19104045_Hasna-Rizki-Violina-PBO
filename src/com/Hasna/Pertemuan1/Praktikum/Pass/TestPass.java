package com.Hasna.Pertemuan1.Praktikum.Pass;

public class TestPass {
    //Deklarasi Variable
    int nomor1;
    int nomor2;

    //constuctor
    public TestPass(int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    //Pass by Value
    public void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    //Pass by Reference
    public void calculate(TestPass pass) {
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 2;
    }
}
