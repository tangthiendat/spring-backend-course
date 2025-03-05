package com.ttdat.backendcourse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id", columnDefinition = "UUID DEFAULT gen_random_uuid()")
    private UUID productId;

    private String productName;

    @Column(precision = 15, scale = 2)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    @ManyToOne
    @JoinColumn(name = "product_type_id", referencedColumnName = "productTypeId")
    private ProductType productType;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "product_colors",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    private List<Color> colors;

    @PrePersist
    public void prePersist() {
        //set default product status
        if (productStatus == null) {
            productStatus = ProductStatus.AVAILABLE;
        }
    }
}
