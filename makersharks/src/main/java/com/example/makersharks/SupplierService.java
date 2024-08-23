package com.example.makersharks;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SupplierService {
    Page<Supplier> findSuppliers(SupplierQueryDTO queryDTO, Pageable pageable);
}
