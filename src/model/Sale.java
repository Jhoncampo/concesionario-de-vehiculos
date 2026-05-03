package model;

public class Sale {

    private double amount;
    private Vehicle vehicle;
    private Customer customer;

    public Sale(double amount, Vehicle vehicle, Customer customer) {
        this.amount = amount;
        this.vehicle = vehicle;
        this.customer = customer;
    }

    public double getAmount() { return amount; }
    public Vehicle getVehicle() { return vehicle; }
    public Customer getCustomer() { return customer; }

    @Override
    public String toString() {
        return "Sale{" +
                "amount=" + amount +
                ", vehicle=" + vehicle +
                ", customer=" + customer +
                '}';
    }
}