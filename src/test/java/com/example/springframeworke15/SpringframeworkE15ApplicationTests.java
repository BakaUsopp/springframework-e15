package com.example.springframeworke15;

import com.example.springframeworke15.repositories.ProductRepository;
import com.example.springframeworke15.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;


@SpringBootTest
class SpringframeworkE15ApplicationTests {

    @MockBean
    private ProductRepository productRepository;


    @Autowired
    private ProductService productService;

    @Test
    public void noProductReturnTest() {

        given(productRepository.getProducts()).willReturn(Collections.emptyList());


        List<String> res = productService.getProductsNamesWithEvenNoOfChars();
        assertTrue(res.isEmpty());

    }

    @Test
    public void moreProductsAreFoundTest(){


        List<String> input = Arrays.asList("Yash", "Usopp", "Zoro");

        given(productRepository.getProducts()).willReturn(input);
        List<String> res = productService.getProductsNamesWithEvenNoOfChars();
        assertEquals(2,res.size());
//        assertEquals(2, res.size());
//        verify(productRepository, times(1)).addProduct(any());

    }

}
