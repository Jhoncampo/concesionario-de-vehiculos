//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import model.Car;
import model.Customer;
import model.Sale;
import model.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("This a car");

        Vehicle car = new Car("100","Toyota", 2026, 0);
        Vehicle truck = new Car("200","Mercedez", 2020, 15000);
        Vehicle motorcycle = new Car("300","Duke", 2025, 1000);
        Customer client1 = new Customer("Jhon", "Campo", "1067461226");
        Sale sale1 = new Sale(1, motorcycle, client1);
     
        // System.out.println(car);
        // System.out.println(truck);
        // System.out.println(motorcycle);
        // System.out.println(client1);
        System.out.println(sale1);
    }
}