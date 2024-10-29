package com.example.productservice.service.impl;

import com.example.productservice.dto.ProductDto;
import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepo;
import com.example.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;
    @Override
    public ProductDto creatProduct(ProductDto productDto) {

       return modelMapper.map(productRepo.save(modelMapper.map(productDto, Product.class)), ProductDto.class);
    }
}
