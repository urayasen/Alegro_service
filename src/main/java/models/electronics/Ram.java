package models.electronics;

public class Ram {
    //Розмір оперативної пам'яті
    private String ram_size;
    //Максимальний розмір оперативної пам'яті
    private String maximum_amountofRAM;
//    Тип оперативної пам'яті
    private String ram_type;

    public Ram(String ram_size, String maximum_amountofRAM, String ram_type) {
        this.ram_size = ram_size;
        this.maximum_amountofRAM = maximum_amountofRAM;
        this.ram_type = ram_type;
    }

    public String getRam_size() {
        return ram_size;
    }

    public void setRam_size(String ram_size) {
        this.ram_size = ram_size;
    }

    public String getMaximum_amountofRAM() {
        return maximum_amountofRAM;
    }

    public void setMaximum_amountofRAM(String maximum_amountofRAM) {
        this.maximum_amountofRAM = maximum_amountofRAM;
    }

    public String getRam_type() {
        return ram_type;
    }

    public void setRam_type(String ram_type) {
        this.ram_type = ram_type;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "ram_size='" + ram_size + '\'' +
                ", maximum_amountofRAM='" + maximum_amountofRAM + '\'' +
                ", ram_type='" + ram_type + '\'' +
                '}' + "\n";
    }
}
