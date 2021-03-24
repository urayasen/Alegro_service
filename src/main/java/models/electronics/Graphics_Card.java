package models.electronics;

public class Graphics_Card {
    //Тип відеокарти
    private String graphics_card_type;
    //Пам'ять відеокарти
    private String graphics_card_memory;

    public Graphics_Card(String graphics_card_type, String graphics_card_memory) {
        this.graphics_card_type = graphics_card_type;
        this.graphics_card_memory = graphics_card_memory;
    }

    public String getGraphics_card_type() {
        return graphics_card_type;
    }

    public void setGraphics_card_type(String graphics_card_type) {
        this.graphics_card_type = graphics_card_type;
    }

    public String getGraphics_card_memory() {
        return graphics_card_memory;
    }

    public void setGraphics_card_memory(String graphics_card_memory) {
        this.graphics_card_memory = graphics_card_memory;
    }

    @Override
    public String toString() {
        return "Graphics_Card{" +
                "graphics_card_type='" + graphics_card_type + '\'' +
                ", graphics_card_memory='" + graphics_card_memory + '\'' +
                '}' + "\n";
    }
}
