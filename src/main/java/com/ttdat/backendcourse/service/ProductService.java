package com.ttdat.backendcourse.service;

import com.ttdat.backendcourse.dto.ProductDTO;
import com.ttdat.backendcourse.entity.Product;
import com.ttdat.backendcourse.entity.ProductStatus;
import com.ttdat.backendcourse.exception.ResourceNotFoundException;
import com.ttdat.backendcourse.mapper.ProductMapper;
import com.ttdat.backendcourse.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        return productMapper.toProductDTO(productRepository.save(product));
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public List<ProductDTO> getProductsByStatus(ProductStatus status) {
        return productRepository.findAllByProductStatus(status).stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public ProductDTO updateProduct(UUID id, ProductDTO productDTO) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        productMapper.updateProductFromDTO(productDTO, product);
        return productMapper.toProductDTO(productRepository.save(product));
    }

    public void deleteProduct(UUID id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
        productRepository.delete(product);
    }
}
