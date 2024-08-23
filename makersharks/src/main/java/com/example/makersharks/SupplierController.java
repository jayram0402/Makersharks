package com.example.makersharks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/query")
    public ResponseEntity<Page<Supplier>> getSuppliers(@RequestBody SupplierQueryDTO queryDTO, Pageable pageable) {
        Page<Supplier> suppliers = supplierService.findSuppliers(queryDTO, pageable);
        return ResponseEntity.ok(suppliers);
    }
}
