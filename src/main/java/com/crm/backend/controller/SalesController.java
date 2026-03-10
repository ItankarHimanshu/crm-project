package com.crm.backend.controller;

import com.crm.backend.model.Sale;
import com.crm.backend.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
@CrossOrigin("*")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @GetMapping
    public List<Sale> getAllSales() {
        return salesService.getAllSales();
    }

    @PostMapping
    public Sale createSale(@RequestBody Sale sale) {
        return salesService.createSale(sale);
    }

    @GetMapping("/{id}")
    public Sale getSaleById(@PathVariable Long id) {
        return salesService.getSaleById(id);
    }

    @PutMapping("/{id}")
    public Sale updateSale(@PathVariable Long id, @RequestBody Sale sale) {
        return salesService.updateSale(id, sale);
    }

    @DeleteMapping("/{id}")
    public String deleteSale(@PathVariable Long id) {
        salesService.deleteSale(id);
        return "Sale deleted successfully";
    }
}