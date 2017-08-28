package com.tiy;

public abstract class Soldier {

    protected String name;
    protected String rank;
    protected int serialNumber;

    public Soldier() {
    }

    public String eat() {
        return "chew";
    }

    public String sleep() {
        return "snore";
    }

    public String walk() {
        return "trudge";
    }

    public abstract String speak();


    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
