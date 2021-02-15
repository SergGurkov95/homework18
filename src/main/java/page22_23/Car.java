package page22_23;

public class Car {
    private String brand;
    private String model;
    private String[] colors;
    private String speedUnit;
    private Integer speedValue;
    private Double volume;
    private Integer rpm;
    private String compressionRation;
    private Integer seatingCapacity;

    public Car(String brand, String model, String[] colors, String speedUnit, Integer speedValue, Double volume, Integer rpm, String compressionRation, Integer seatingCapacity) {
        this.brand = brand;
        this.model = model;
        this.colors = colors;
        this.speedUnit = speedUnit;
        this.speedValue = speedValue;
        this.volume = volume;
        this.rpm = rpm;
        this.compressionRation = compressionRation;
        this.seatingCapacity = seatingCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getSpeedUnit() {
        return speedUnit;
    }

    public void setSpeedUnit(String speedUnit) {
        this.speedUnit = speedUnit;
    }

    public Integer getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(Integer speedValue) {
        this.speedValue = speedValue;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public String getCompressionRation() {
        return compressionRation;
    }

    public void setCompressionRation(String compressionRation) {
        this.compressionRation = compressionRation;
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
