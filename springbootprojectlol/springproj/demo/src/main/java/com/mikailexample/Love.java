package com.mikailexample;

public class Love implements Peace {
    private int love;
    public Love() {
        System.out.println("Love");
    }

    public int getLove() {
        return love;
    }
    public void setLove(int love) {
        this.love = love;
    }
    @Override
    public void loving() {
        System.out.println("I love you");
    }
}
