package com.example.makersharks;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;
    private String companyName;
    private String website;
    private String location;
    private String natureOfBusiness;

    @ElementCollection
    private Set<String> manufacturingProcesses;

    // Getters and Setters
    // If using Lombok, you can replace these with @Data annotation
}
