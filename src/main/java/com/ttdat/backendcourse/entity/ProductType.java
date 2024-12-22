package com.ttdat.backendcourse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_types")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_type_id_seq")
    @SequenceGenerator(name = "product_type_id_seq", sequenceName = "product_type_id_seq", allocationSize = 1)
    private int productTypeId;
    private String productTypeName;

    @OneToMany(mappedBy = "productType")
    private List<Product> products;
}
