package models;

public class Store_Goods {
    //назва товару
    private String name;
    //вартісь товару
    private double cost;
    //процентна знижка товару
    private int percentage_discount;

    public Store_Goods(String name, double cost, int percentage_discount) {
        this.name = name;
        this.cost = cost;
        this.percentage_discount = percentage_discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        if (percentage_discount==0)
            return cost;
        else
            return cost*(100 - percentage_discount)/100;

    }

    public void setCost(double cost) {

        this.cost = cost;
    }

    public int getPercentage_discount() {
        return percentage_discount;
    }

    public void setPercentage_discount(int percentage_discount) {
        this.percentage_discount = percentage_discount;
    }

    @Override
    public String toString() {
        return "Store_Goods{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", percentage_discount=" + percentage_discount +
                '}'+"\n";
    }
}
