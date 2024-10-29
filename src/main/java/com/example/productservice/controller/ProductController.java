package com.example.productservice.controller;

import com.example.productservice.dto.ProductDto;
import com.example.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add-product")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
         return ResponseEntity.ok(productService.creatProduct(productDto));
    }
}
