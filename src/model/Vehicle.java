package model;

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

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
