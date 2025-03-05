package com.ttdat.backendcourse.repository;

import com.ttdat.backendcourse.entity.Product;
import com.ttdat.backendcourse.entity.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAllByProductStatus(ProductStatus productStatus);
}
