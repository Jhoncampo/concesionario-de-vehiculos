package service;

import java.util.List;

import interfaces.Crud;
import model.Vehicle;
import repository.DataStorage;

public class VehicleService implements Crud<Vehicle> {
    @Override
    public void create(Vehicle vehicle) {
        boolean exists = DataStorage.vehicles.stream().anyMatch(v -> v.getCode().equals(vehicle.getCode()));

        if (!exists) {
            DataStorage.vehicles.add(vehicle);
        } else {
            System.out.println("Vehicle with this code already exist");
        }
    }

    @Override
    public List<Vehicle> findAll() {
        return DataStorage.vehicles;
    }

    @Override
    public Vehicle findByCode(String code) {
        return DataStorage.vehicles.stream()
                .filter(v -> v.getCode().equals(code))
                .findFirst().orElse(null);
    }

    public void update(String code, Vehicle updateVehicle) {
        Vehicle existing = findByCode(code);

        if (existing != null) {
            existing.setMileage(updateVehicle.getMileage());
            System.out.println("Vehicle updated successfully");
        } else {
            System.out.println("Vehicle not found");
        }
    }

    @Override
    public void delete(String code) {
        DataStorage.vehicles.removeIf(v -> v.getCode().equals(code));
    }
}
