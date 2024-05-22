package com.shopingcart.service.impl;


import com.shopingcart.common.Utils;
import com.shopingcart.dto.ProductDto;
import com.shopingcart.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("productService")
public class ProductServiceImpl implements ProductService {


    /**
     * THis method will return list of products from db
     *
     * @return List of product
     */
    @Override
    public List<ProductDto> findAllProduct() {
        log.info("Inovked : findAllProduct");
        List<ProductDto> productDtos = Utils.PRODUCT_DTO_LIST;
        if (productDtos.isEmpty()) {
            log.info("No Recored forund exception throw");
        }
        return productDtos;
    }
}
