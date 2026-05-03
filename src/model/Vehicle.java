package model;

/**
 * Represents a vehicle in the dealership.
 * This is an public class used as a base for all vehicle types.
 */

public class Vehicle {
    private String code;
    private String brand;
    private String type;
    private int year;
    private double mileage;

    public Vehicle(String code, String brand, String type, int year, double mileage) {
        this.code = code;
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.mileage = mileage;
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
