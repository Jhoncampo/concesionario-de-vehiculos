package service;

import java.util.List;

import interfaces.Crud;
import model.Sale;
import repository.DataStorage;

public class SaleService implements Crud<Sale> {

    VehicleService vehicleService = new VehicleService();

    @Override
    public void create(Sale sale) {
        DataStorage.sales.add(sale);
        vehicleService.delete(sale.getVehicle().getCode());
    }

    @Override
    public List<Sale> findAll() {
        if (DataStorage.sales.isEmpty()) {
            System.out.println("There are not sales");
        }
        return DataStorage.sales;
    }

    @Override
    public Sale findByCode(String code) {
        return null;
    }

    @Override
    public void update(String code, Sale updateSale) {
        System.out.println("Update not supported for sales");
    }

    @Override
    public void delete(String code) {

    }
}
