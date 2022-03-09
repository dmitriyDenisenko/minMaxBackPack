package com.example.projectbackpack;

public class Item {
    private String name;
    private String weight;
    private String volume;
    private Boolean significance;

    public Item(String name, String weight, String volume, Boolean significance) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
        this.significance = significance;
    }
    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public String getVolume() {
        return volume;
    }

    public Boolean isSignificance() {
        return significance;
    }
}
