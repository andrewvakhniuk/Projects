package com.vah;

import com.vah.entities.Product;
import com.vah.services.ProductService;
import com.vah.services.ProductServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ProductServiceInterface productService = (ProductServiceInterface) context.getBean("productService");
        productService.getProduct(1);
        productService.getProduct(1);
//        Product pd = new Product();
//        pd.setName("phone");
//        productService.addProduct(pd);
    }
}
