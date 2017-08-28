package com.tiy;

public class Army extends Soldier implements GroundAssault {

    @Override
    public String handToHand() {
        return "KaPow!";
    }

    @Override
    public String guns() {
        return "It jammed!";
    }

    @Override
    public String march() {
        return "I'm tarrrrrred, sergeant!";
    }

    @Override
    public String speak() {
        return "Hoohah!!";
    }
}
