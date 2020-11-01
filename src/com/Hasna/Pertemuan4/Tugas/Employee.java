package com.Hasna.Pertemuan4.Tugas;

public abstract class Employee {
    private String employee;

    public Employee(String employee) {
        this.employee = employee;
    }

    //method abstrak
    protected abstract void getGaji();

    public String toString() {
        return "Pekerjaan\t\t\t: " + employee;
    }
}

