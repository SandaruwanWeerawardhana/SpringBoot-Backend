package edu.icet.spring01_20.service;

import edu.icet.spring01_20.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class ProductService implements Product_Interface{

    public ArrayList<Product> getProduct(){
        Product product = new Product("sandaruwan","ms",3445.00);
        Product product2 = new Product("saman","mst",344775.00);
        Product product3 = new Product("sandaru","mskt",34445.00);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);

        return products;


    }
}
