package com.ttdat.backendcourse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.UUID;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
    UUID productId;
    @NotBlank(message = "Product name is required")
    String productName;
    @Min(value = 0, message = "Price must be greater than 0")
    BigDecimal price;
    String productStatus;
}
