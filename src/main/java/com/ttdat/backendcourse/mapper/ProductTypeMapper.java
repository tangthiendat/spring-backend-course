package com.ttdat.backendcourse.mapper;

import com.ttdat.backendcourse.dto.ProductTypeDTO;
import com.ttdat.backendcourse.entity.ProductType;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {
    ProductType toProductType(ProductTypeDTO productTypeDTO);
    ProductTypeDTO toProductTypeDTO(ProductType productType);
}
