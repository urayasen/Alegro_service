package models.Beauty;

import models.Store_Goods;

public class Shampoos extends Store_Goods {

    private String condition;
    private String brand;
    private String hair_color;
    private String hair_type;
    private String action;
    private String packaging_capacity;
    private String packaging;
    private String size;


    public Shampoos(String name, double cost, int percentage_discount) {
        super(name, cost, percentage_discount);
    }

    public Shampoos(String name, double cost, int percentage_discount, String condition, String brand, String hair_color,
                    String hair_type, String action, String packaging_capacity, String packaging, String size) {
        super(name, cost, percentage_discount);
        this.condition = condition;
        this.brand = brand;
        this.hair_color = hair_color;
        this.hair_type = hair_type;
        this.action = action;
        this.packaging_capacity = packaging_capacity;
        this.packaging = packaging;
        this.size = size;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getHair_type() {
        return hair_type;
    }

    public void setHair_type(String hair_type) {
        this.hair_type = hair_type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPackaging_capacity() {
        return packaging_capacity;
    }

    public void setPackaging_capacity(String packaging_capacity) {
        this.packaging_capacity = packaging_capacity;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shampoos(" + super.toString() + ")" +
                "{condition='" + condition + '\'' +
                ", brand='" + brand + '\'' +
                ", hair_color='" + hair_color + '\'' +
                ", hair_type='" + hair_type + '\'' +
                ", action='" + action + '\'' +
                ", packaging_capacity='" + packaging_capacity + '\'' +
                ", packaging='" + packaging + '\'' +
                ", size='" + size + '\'' +
                "} " + "\n";
    }
}
