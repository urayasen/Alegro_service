package models.electronics;

public class Processor {
//    Серія процесорів
    private String cpu_Series;
    //Базовий годинник процесора
    private String cpu_base_clock;
    //Кеш процесора
    private String cpu_Cache;

    public Processor(String cpu_Series, String cpu_base_clock, String cpu_Cache) {
        this.cpu_Series = cpu_Series;
        this.cpu_base_clock = cpu_base_clock;
        this.cpu_Cache = cpu_Cache;
    }

    public String getCpu_Series() {
        return cpu_Series;
    }

    public void setCpu_Series(String cpu_Series) {
        this.cpu_Series = cpu_Series;
    }

    public String getCpu_base_clock() {
        return cpu_base_clock;
    }

    public void setCpu_base_clock(String cpu_base_clock) {
        this.cpu_base_clock = cpu_base_clock;
    }

    public String getCpu_Cache() {
        return cpu_Cache;
    }

    public void setCpu_Cache(String cpu_Cache) {
        this.cpu_Cache = cpu_Cache;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "cpu_Series='" + cpu_Series + '\'' +
                ", cpu_base_clock='" + cpu_base_clock + '\'' +
                ", cpu_Cache='" + cpu_Cache + '\'' +
                '}' + "\n";
    }
}
