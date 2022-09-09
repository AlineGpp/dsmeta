package com.inehgpp.dsmeta.repositories;

import com.inehgpp.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository <Sale,Long> {
}
