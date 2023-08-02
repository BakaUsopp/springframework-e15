package com.example.springframeworke15.services;

import com.example.springframeworke15.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
//
//    @GetMapping("/hello")
//    public ProductRepository getProductRepository() {
//        return productRepository.getProducts(Arrays);
//    }

    public List<String> getProductsNamesWithEvenNoOfChars() {
        List<String> names = productRepository.getProducts();

        return names.stream().
                filter(name -> name.length() %2 ==0)
                .collect(Collectors.toList());


//        List<String> result = new ArrayList<>();
//        for (String name : names) {
//            if(name.length() %2 == 0) {
//                result.add(name);
////                productRepository.addProduct(name);
//            }
//        }
//        return result;
    }
}
