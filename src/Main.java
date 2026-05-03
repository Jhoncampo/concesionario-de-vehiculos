//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

import model.Car;
import model.Customer;
import model.Motorcycle;
import model.Sale;
import model.Truck;
import model.Vehicle;
import service.SaleService;
import service.VehicleService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleService vehicleService = new VehicleService();
        SaleService saleService = new SaleService();

        int option;

        do {
            System.out.println("\n DEALERSHIP MENU");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show Vehicles");
            System.out.println("3. Update Vehicle");
            System.out.println("4. Register Sale");
            System.out.println("5. Show Sales");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nSelect vehicle type:");
                    System.out.println("1. Car");
                    System.out.println("2. Truck");
                    System.out.println("3. Motorcycle");
                    int typeOption = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Code: ");
                    String code = scanner.nextLine();

                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();

                    System.out.print("Mileage: ");
                    double mileage = scanner.nextDouble();
                    scanner.nextLine();

                    Vehicle vehicle = null;

                    switch (typeOption) {
                        case 1:
                            vehicle = new Car(code, brand, year, mileage);
                            break;
                        case 2:
                            vehicle = new Truck(code, brand, year, mileage);
                            break;
                        case 3:
                            vehicle = new Motorcycle(code, brand, year, mileage);
                            break;
                        default:
                            System.out.println("Invalid type");
                    }

                    if (vehicle != null) {
                        vehicleService.create(vehicle);
                        System.out.println("Vehicle added successfully");
                    }
                    break;
                case 2:
                    System.out.println("\n=== VEHICLES ===");
                    vehicleService.findAll().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("\nEnter vehicle code to update: ");
                    String updateCode = scanner.nextLine();

                    Vehicle vehicleToUpdate = new VehicleService().findByCode(updateCode);
                    if (vehicleToUpdate == null) {
                        System.out.println("Vehicle not found");
                        break;
                    }
                    System.out.print("New mileage: ");
                    double newMileage = scanner.nextDouble();
                    scanner.nextLine();
                    Vehicle tempCar = new Car(
                            vehicleToUpdate.getCode(),
                            vehicleToUpdate.getBrand(),
                            vehicleToUpdate.getYear(),
                            newMileage);

                    vehicleService.update(updateCode, tempCar);

                    break;
                case 4:
                    System.out.print("\nEnter vehicle code: ");
                    String vehicleCode = scanner.nextLine();

                    Vehicle foundVehicle = vehicleService.findByCode(vehicleCode);

                    if (foundVehicle == null) {
                        System.out.println("Vehicle not found");
                        break;
                    }
                    System.out.print("Customer First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Customer Last Name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Customer Document: ");
                    String document = scanner.nextLine();

                    System.out.print("Sale Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    Customer customer = new Customer(firstName, lastName, document);
                    Sale sale = new Sale(amount, foundVehicle, customer);

                    saleService.create(sale);
                    System.out.println("Sale registered successfully");
                    break;
                case 5:
                    System.out.println("\n=== SALES ===");
                    saleService.findAll().forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 5);
        scanner.close();
    }
}