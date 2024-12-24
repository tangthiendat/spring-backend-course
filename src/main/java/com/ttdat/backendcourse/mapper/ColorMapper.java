package com.ttdat.backendcourse.mapper;

import com.ttdat.backendcourse.dto.ColorDTO;
import com.ttdat.backendcourse.entity.Color;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ColorMapper {
     Color toColor(ColorDTO colorDTO);
     ColorDTO toColorDTO(Color color);
}
