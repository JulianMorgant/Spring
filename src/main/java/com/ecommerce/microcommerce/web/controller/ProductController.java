package com.ecommerce.microcommerce.web.controller;


import com.ecommerce.microcommerce.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        Product product = new Product(id,new String("Aspi"),120);
    return product;
    }

    @GetMapping(value = "/listeProduits")
    public String listeDesProduits(){
        return "Voilà les produits";
    }

}
