package com.wd.demo.db2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("db2SqlSessionFactory")
public interface ProductMapper {

    @Insert("insert into product(productName, productPrice) values(#{productName}, #{productPrice})")
    void addProduct(@Param("productName") String name, @Param("productPrice") Double price);
}
