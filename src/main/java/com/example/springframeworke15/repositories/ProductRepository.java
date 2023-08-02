package com.example.springframeworke15.repositories;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    public List<String> getProducts() {
        return Arrays.asList("Yash", "Usopp","Zoro");
    }

    public void addProduct(String name){

    }
}
