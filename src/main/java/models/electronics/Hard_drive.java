package models.electronics;

public class Hard_drive {
    //Ємність диска
    private String disk_capacity;
    //Інтерфейс диска
    private String disk_interface;
    //Тип жорсткого диска
    private String hard_disk_type;

    public Hard_drive(String disk_capacity, String disk_interface, String hard_disk_type) {
        this.disk_capacity = disk_capacity;
        this.disk_interface = disk_interface;
        this.hard_disk_type = hard_disk_type;
    }

    public String getDisk_capacity() {
        return disk_capacity;
    }

    public void setDisk_capacity(String disk_capacity) {
        this.disk_capacity = disk_capacity;
    }

    public String getDisk_interface() {
        return disk_interface;
    }

    public void setDisk_interface(String disk_interface) {
        this.disk_interface = disk_interface;
    }

    public String getHard_disk_type() {
        return hard_disk_type;
    }

    public void setHard_disk_type(String hard_disk_type) {
        this.hard_disk_type = hard_disk_type;
    }

    @Override
    public String toString() {
        return "Hard_drive{" +
                "disk_capacity='" + disk_capacity + '\'' +
                ", disk_interface='" + disk_interface + '\'' +
                ", hard_disk_type='" + hard_disk_type + '\'' +
                '}' + "\n";
    }
}
