package com.company;

public class Class {
    private int nomer;
    private String sоz;
    private int[] array;

    public Class(int nomer, String sоz, int[] array) {
        this.nomer = nomer;
        this.sоz = sоz;
        for (int a : array) {
            System.out.println("array ->"+a);
        }
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getSоz() {
        return sоz;
    }

    public void setSоz(String sоz) {
        this.sоz = sоz;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}