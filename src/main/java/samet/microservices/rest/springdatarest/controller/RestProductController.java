package samet.microservices.rest.springdatarest.controller;

import org.springframework.web.bind.annotation.*;
import samet.microservices.rest.springdatarest.model.Product;
import samet.microservices.rest.springdatarest.repositories.ProductRepository;

import java.util.List;

@RestController
public class RestProductController {
    private ProductRepository productRepository;

    public RestProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(path = "/products")
    public List<Product> listProducts(){
        return productRepository.findAll();
    }
    @GetMapping(path = "/products/{id}")
    public Product getOneProduct(@PathVariable Long id){
        return productRepository.findById(id).get();
    }

    @PostMapping(path = "/products")
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping(path = "/products/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
        product.setId(id);
        return productRepository.save(product);
    }
    @DeleteMapping (path = "/products/{id}")
    public void deleteProduct(@PathVariable Long id){

         productRepository.deleteById(id);
    }

}
