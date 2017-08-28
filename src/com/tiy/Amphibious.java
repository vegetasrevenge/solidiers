package com.tiy;

public interface Amphibious {

    String swim();
    String harpoon();

    default String scuba() {
        return "bubble bubble";
    }

}
