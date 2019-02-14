package com.ecommerce.microcommerce.web.controller;


import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @GetMapping(value = "/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {

    return productDao.findById(id);
    }

    @GetMapping(value = "/listeProduits")
    public List<Product> listeDesProduits(){
        return productDao.findAll();
    }

    @PostMapping(value = "/ajouterUnProduit")
    public void ajouterUnProduit(@RequestBody Product product) {
        productDao.save(product);
    }
}
