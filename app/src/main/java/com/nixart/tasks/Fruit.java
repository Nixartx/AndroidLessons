package com.nixart.tasks;

public class Fruit {
    private String name;
    private int count;
    private String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Fruit(String name, String unit) {
        this.name = name;
        this.count = 0;
        this.unit = unit;
    }
}
