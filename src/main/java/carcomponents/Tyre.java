package carcomponents;

public class Tyre {

    String manufacturer;
    int diameter;

    public Tyre(String manufacturer, int diameter) {
        this.manufacturer = manufacturer;
        this.diameter = diameter;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDiameter() {
        return diameter;
    }
}
