package edu.icet.spring01_20.service.impl;

import edu.icet.spring01_20.entity.ProductEntity;
import edu.icet.spring01_20.model.Product;
import edu.icet.spring01_20.repsitory.ProductRepository;
import edu.icet.spring01_20.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    public ArrayList<Product> getProduct() {
        Product product = new Product("001","sandaruwan", "wrx", 3445.00);
        Product product2 = new Product("002","saman", "msi", 344775.00);
        Product product3 = new Product("003","sandaru", "jayan", 34445.00);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);

        return products;
    }
    void saveProduct(Product product){
        ProductEntity productEntity = new ProductEntity();
        productRepository.save(productEntity);
    }

}
