package com.crm.backend.service;

import com.crm.backend.model.Sale;
import com.crm.backend.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    public List<Sale> getAllSales() {
        return salesRepository.findAll();
    }

    public Sale createSale(Sale sale) {
        return salesRepository.save(sale);
    }

    public Sale getSaleById(Long id) {

        return salesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sale not found"));
    }

    public Sale updateSale(Long id, Sale updatedSale) {

        Sale sale = salesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sale not found"));

        sale.setAmount(updatedSale.getAmount());
        sale.setStatus(updatedSale.getStatus());
        sale.setCustomer(updatedSale.getCustomer());

        return salesRepository.save(sale);
    }

    public void deleteSale(Long id) {
        salesRepository.deleteById(id);
    }
}