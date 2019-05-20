package com.funch.ririweb.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByNameAndCompany(String name, String company);
}
