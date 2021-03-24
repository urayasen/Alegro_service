package models.electronics;

import models.Store_Goods;

public class Laptop extends Store_Goods {

    private String color;
    private double weight;
    private Screen screen;
    private Ram ram;
    private Processor processor;
    private Hard_drive hard_drive;
    private Graphics_Card graphics_card;


    public Laptop(String name, double cost, int percentage_discount, String color, double weight) {
        super(name, cost, percentage_discount);
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Hard_drive getHard_drive() {
        return hard_drive;
    }

    public void setHard_drive(Hard_drive hard_drive) {
        this.hard_drive = hard_drive;
    }

    public Graphics_Card getGraphics_card() {
        return graphics_card;
    }

    public void setGraphics_card(Graphics_Card graphics_card) {
        this.graphics_card = graphics_card;
    }

    @Override
    public String toString() {
        return "Laptop(" + super.toString()+")"+
                "{color='" + color + '\'' +
                ", weight=" + weight +
                ", screen=" + screen +
                ", ram=" + ram +
                ", processor=" + processor +
                ", hard_drive=" + hard_drive +
                ", graphics_card=" + graphics_card +
                "} " +"\n ";
    }
}
