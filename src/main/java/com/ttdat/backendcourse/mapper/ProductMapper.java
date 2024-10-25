package com.ttdat.backendcourse.mapper;

import com.ttdat.backendcourse.dto.ProductDTO;
import com.ttdat.backendcourse.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toProduct(ProductDTO productDTO);
    ProductDTO toProductDTO(Product product);
}
