package com.Hasna.Pertemuan5.Praktikum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        File file = new File("D:\\CobaNih.txt");
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read File Berhasil");
        } catch (FileNotFoundException e) {
            System.out.println("File-nya Gak Ada");
        }
    }
}
