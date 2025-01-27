package edu.icet.spring01_20.controller;

import edu.icet.spring01_20.model.Product;
import edu.icet.spring01_20.service.Product_Interface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {

    /*    @Autowired
        Product_Interface productService;
    */

    /*    Product_Interface productService;

        ProductController(Product_Interface productService){
            this.productService=productService;
        }
    */

    final Product_Interface productService;


    @GetMapping("/get")
    ArrayList<Product> getProductList() {

        return productService.getProduct();

    }
}
