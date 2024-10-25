package com.ttdat.backendcourse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id", columnDefinition = "UUID DEFAULT gen_random_uuid()")
    private UUID productId;

    private String productName;

    @Column(precision = 15, scale = 2)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(255) DEFAULT 'AVAILABLE'")
    private ProductStatus productStatus;

    @PrePersist
    public void prePersist() {
        //set default product status
        if (productStatus == null) {
            productStatus = ProductStatus.AVAILABLE;
        }
    }
}
