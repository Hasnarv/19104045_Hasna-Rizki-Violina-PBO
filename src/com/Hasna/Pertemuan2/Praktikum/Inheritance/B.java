package com.Hasna.Pertemuan2.Praktikum.Inheritance;

public class B extends A {
    //Deklarasi Variable
    public int z;

    //data x y dari data yg ada di super class
    public void sumValue() {
        System.out.println("Jumlah\t: " + (x + y + z));
    }

}
