package com.example.demo.controller;

import com.example.demo.dto.Category;
import com.example.demo.dto.Product;
import com.example.demo.service.DisplayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class TestController {

    private final DisplayService displayService;

    @RequestMapping("/selectCategoryList")
    public List<Category> selectCategoryList(){
    return displayService.selectCategoryList();
    }

    @GetMapping("/selectProductList")
    public List<Product> selectProductList(@RequestParam int cateNum){
        return displayService.selectProductList(cateNum);
    }

    @GetMapping("/getProductDetail")
    public Product getProductDetail(@RequestParam int pdNum){
        return displayService.getProductDetail(pdNum);
    }
}
