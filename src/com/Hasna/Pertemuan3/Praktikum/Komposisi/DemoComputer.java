package com.Hasna.Pertemuan3.Praktikum.Komposisi;

public class DemoComputer {

    public static void main(String[] args) {
        Computer computer = new Computer("Gaming");

        Keyboard keyboard = new Keyboard("Sades", "Mechanicl");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armageddon", "24", "144");
        Cpu cpu = new Cpu("Intel i9", "Nvidia 3080", "32");

        computer.addCompoent(keyboard, mouse, monitor, cpu);

        System.out.println("Type Computer\t: " + computer.getType());
        System.out.println();

        System.out.println("Keyboard\t ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t ");
        computer.getMouse().PrintSpec();

        System.out.println("Monitor\t ");
        computer.getMonitor().PrintSpec();

        System.out.println("Cpu\t ");
        computer.getCpu().PrintSpec();

    }

}
