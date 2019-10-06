package com.wd.demo.controller;

import com.wd.demo.db1.service.IUserService;
import com.wd.demo.db2.service.IProductService;
import com.wd.demo.entity.Product;
import com.wd.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    IUserService userService;

    @Autowired
    IProductService productService;

    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        User user = new User();
        user.setUserName("wan");
        user.setUserPassword("111");

        userService.saveUser(user);

        Product product = new Product();
        product.setProductName("123");
        product.setProductPrice(12.2);

        productService.saveProduct(product);

        return "ok";
    }
}
