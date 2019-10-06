package com.wd.demo.db2.service.impl;

import com.wd.demo.db2.mapper.ProductMapper;
import com.wd.demo.db2.service.IProductService;
import com.wd.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService
{
    @Autowired
    private ProductMapper productMapper;

    @Override
   // @Transactional(transactionManager = "db2TransactionManager")
    public void saveProduct(Product product) {
        productMapper.addProduct(product.getProductName(), product.getProductPrice());
    }
}
