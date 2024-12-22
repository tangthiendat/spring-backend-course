package com.ttdat.backendcourse.mapper;

import com.ttdat.backendcourse.dto.ProductDTO;
import com.ttdat.backendcourse.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {ProductTypeMapper.class})
public interface ProductMapper {
    Product toProduct(ProductDTO productDTO);
    ProductDTO toProductDTO(Product product);
    void updateProductFromDTO(ProductDTO productDTO, @MappingTarget Product product);
}
