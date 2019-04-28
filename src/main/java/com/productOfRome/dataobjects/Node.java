package com.productOfRome.dataobjects;

public class Node {

    public Node(int numberOfDays, String activity) {
        this.numberOfDays = numberOfDays;
        this.activity = activity;
    }

    public Node(String activity) {
        this.activity = activity;
    }

    private int numberOfDays;
    private String activity;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
