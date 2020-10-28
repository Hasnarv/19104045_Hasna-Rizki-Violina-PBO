package com.Hasna.Pertemuan1.Tugas.Soal1;

public class KonversiSuhu {
    //Deklarasi variable
    double a, b, c, d;

    //constructor
    public KonversiSuhu(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    //method
    public void konversi(KonversiSuhu pass) {
        pass.a = 1.8 * a + 32; //c -> f
        pass.b = 0.56 * (b - 32) + 273; //f -> k
        pass.c = 0.8 * (c - 273); //k -> r
        pass.d = 1.25 * d; //r -> c
    }
}
