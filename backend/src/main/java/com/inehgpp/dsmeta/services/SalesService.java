package com.inehgpp.dsmeta.services;

import com.inehgpp.dsmeta.entities.Sale;
import com.inehgpp.dsmeta.repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    private SalesRepository repository;

    public List<Sale> findSales() {
       return repository.findAll();
    }

}
