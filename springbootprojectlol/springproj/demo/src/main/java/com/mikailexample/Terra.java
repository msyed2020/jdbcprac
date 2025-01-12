package com.mikailexample;

public class Terra {

    private int percentAwesome;
    private Love lovemsg = new Love();

    public Terra() {
        System.out.println("I love Terra");
    }
    public void code() {
        System.out.println("I'm coding");
        lovemsg.loving();
    }

    public int getPercentAwesome() {
        return percentAwesome;
    }

    public void setPercentAwesome(int newPercent) {
        percentAwesome = newPercent;
    }
}
