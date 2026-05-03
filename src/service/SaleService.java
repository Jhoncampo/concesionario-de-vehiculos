package service;

import java.util.List;

import interfaces.Crud;
import model.Sale;
import repository.DataStorage;

public class SaleService implements Crud<Sale> {
    @Override
    public void create(Sale sale){
        DataStorage.sales.add(sale);
    }
     @Override
    public List<Sale> findAll() {
        return DataStorage.sales;
    }

    @Override
    public Sale findByCode(String code) {
        return null; 
    }

    @Override
    public void delete(String code) {
        // Optional
    }
}
