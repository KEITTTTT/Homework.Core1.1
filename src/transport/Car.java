package transport;

public class Car {

    final String brand;
    final String model;
    double engineCapacity;
    private String color;
    final int year;
    final String country;
    private String transmission;
    final String bodyType;
    private String number;
    final String numberOfSeats;
    private boolean typeOfRubber;

    public Car(String brand, String model, double engineCapacity, String color, int year, String country, String transmission, String bodyType, String number, String numberOfSeats, boolean typeOfRubber) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.number = number;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(boolean typeOfRubber) {
        this.typeOfRubber = typeOfRubber;
    }
}
