package com.example.makersharks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Page<Supplier> findSuppliers(SupplierQueryDTO queryDTO, Pageable pageable) {
        return supplierRepository.findSuppliers(
            queryDTO.getLocation(),
            queryDTO.getNatureOfBusiness(),
            queryDTO.getManufacturingProcess(),
            pageable);
    }
}
