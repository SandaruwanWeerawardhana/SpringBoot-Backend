package edu.icet.spring01_20.controller;

import edu.icet.spring01_20.model.Product;
import edu.icet.spring01_20.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // get network request
@CrossOrigin // Get FrontEnd Connection
@RequiredArgsConstructor //Constructor Injection
@Slf4j // create log

public class ProductController {

    /*    @Autowired
        Product_Interface productService;
    */

    /*    Product_Interface productService;

        ProductController(Product_Interface productService){
            this.productService=productService;
        }
    */

    final ProductService productService;

    // http://localhost:8080/products
    @GetMapping("/products")
    List<Product> getProducts() {
        List<Product> products = productService.getProduct();
        return products;

    }
    // http://localhost:8080/product?id=001
    @GetMapping("/product")
    List<Product> getProductById(@RequestParam(value = "id") String id) {
        List<Product> products = productService.getProduct();
        return products;

    }
    // http://localhost:8080/product?id=001,002,003
    @GetMapping("/product")
    List<Product> getProductById(@RequestParam(value = "id") List<String> id) {
        List<Product> products = productService.getProduct();
        return products;

    }

//==================================================================================================================

    @GetMapping("/filter-product/{vendor}")
    List<Product> filterSearchProduct(@PathVariable(value = "vendor") String vendor) {
        log.info("search product-{}", vendor);
        return null;
    }

    @GetMapping("/filter-products")
    List<Product> filterSearchProduct2(@RequestParam(value = "vendor") String vendor,
                                       @RequestParam(value = "name") String name) {

        log.info("search vendor-{}", vendor);
        log.info("search name-{}", name);
        return null;
    }

    @GetMapping("/filter-products2")
    List<Product> filterSearchProduct3(@RequestParam(value = "vendor") String vendor,
                                       @RequestParam(value = "name", required = false) String name) {

        log.info("search vendor-{} | search name- {}", vendor, name);
        return null;
    }

}
