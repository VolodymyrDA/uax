package org.vdoloka.uax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vdoloka.uax.repository.ProductRepository;
import org.vdoloka.uax.repository.entity.Product;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Optional<Product> productOptional = productRepository.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            existingProduct.setTitle(product.getTitle());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setCategory(product.getCategory());
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}