package models.fashion;

import models.Store_Goods;

public class Jacket extends Store_Goods {

    private String brand;
    private String size;
    private String type;
    private String color;
    private String filling;
    private String total_length;
    private String sleeve_length;
    private String underarm_width;
    private String model;


    public Jacket(String name, double cost, int percentage_discount) {
        super(name, cost, percentage_discount);
    }

    public Jacket(String name, double cost, int percentage_discount, String brand, String size, String type, String color, String filling, String total_length, String sleeve_length, String underarm_width, String model) {
        super(name, cost, percentage_discount);
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.color = color;
        this.filling = filling;
        this.total_length = total_length;
        this.sleeve_length = sleeve_length;
        this.underarm_width = underarm_width;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getTotal_length() {
        return total_length;
    }

    public void setTotal_length(String total_length) {
        this.total_length = total_length;
    }

    public String getSleeve_length() {
        return sleeve_length;
    }

    public void setSleeve_length(String sleeve_length) {
        this.sleeve_length = sleeve_length;
    }

    public String getUnderarm_width() {
        return underarm_width;
    }

    public void setUnderarm_width(String underarm_width) {
        this.underarm_width = underarm_width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Jacket(" + super.toString() + ")"+
                "{brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", filling='" + filling + '\'' +
                ", total_length='" + total_length + '\'' +
                ", sleeve_length='" + sleeve_length + '\'' +
                ", underarm_width='" + underarm_width + '\'' +
                ", model='" + model + '\'' +
                "} " + "\n" ;
    }
}
