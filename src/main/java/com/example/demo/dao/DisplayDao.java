package com.example.demo.dao;

import com.example.demo.dto.Category;
import com.example.demo.dto.Product;

import java.util.List;

public interface DisplayDao {
    List<Category> selectCategoryList();
    List<Product> selectProductList(int cateNum);
    Product getProductDetail(int pdNum);
}
