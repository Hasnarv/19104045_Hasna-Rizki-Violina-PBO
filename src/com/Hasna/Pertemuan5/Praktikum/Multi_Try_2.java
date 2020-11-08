package com.Hasna.Pertemuan5.Praktikum;

public class Multi_Try_2 {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            System.out.println(array[5]);
            array[5] = 30 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Panjang Kurang dari 5 !!");
        } catch (ArithmeticException e) {
            System.out.println("Jangan Dibagi 0 !!");
        }
    }
}
