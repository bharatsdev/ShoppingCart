package com.shopingcart.controller;


import com.shopingcart.dto.ProductDto;
import com.shopingcart.service.ProductService;
import com.shopingcart.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ProductController {


    @Autowired
    private ProductService productService;

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("product")
    public ResponseEntity<List<ProductDto>> findAllProduct() {
        return ResponseEntity.ok().body(productService.findAllProduct());
    }


    @GetMapping("purchase")
    public ResponseEntity<Boolean> placePurchaseOrder(
            @RequestParam("id") Integer id,
            @RequestParam("qty") Integer qty) {
        return ResponseEntity.ok().body(purchaseService.orderProduct(id, qty));
    }


}
