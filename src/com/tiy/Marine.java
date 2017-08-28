package com.tiy;

public class Marine extends Soldier implements Amphibious, GroundAssault {


    @Override
    public String swim() {
        return "Splish splash";
    }

    @Override
    public String harpoon() {
        return "Moby Dick, I stabbeth thee!";
    }

    @Override
    public String handToHand() {
        return "Pow!";
    }

    @Override
    public String guns() {
        return "Pew pew pewpewpew";
    }

    @Override
    public String march() {
        return "clop clop clop!";
    }

    @Override
    public String speak() {
        return "Oohrah!!";
    }

    @Override
    public String scuba() {
        return "swimmy swimmy";
    }
}
