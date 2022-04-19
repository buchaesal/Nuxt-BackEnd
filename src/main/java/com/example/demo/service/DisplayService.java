package com.example.demo.service;

import com.example.demo.dao.DisplayDao;
import com.example.demo.dto.Category;
import com.example.demo.dto.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DisplayService {
    private final DisplayDao displayDao;

    public List<Category> selectCategoryList(){
        return displayDao.selectCategoryList();
    }

    public List<Product> selectProductList(int cateNum){
        return displayDao.selectProductList(cateNum);
    }

    public Product getProductDetail(int pdNum){
        return displayDao.getProductDetail(pdNum);
    }
}
