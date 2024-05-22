package com.shopingcart.common;

import com.shopingcart.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class Utils {
    public static final Map<Integer, Integer> PRODUCT_INVENTORY = new HashMap<>();
    public static final List<ProductDto> PRODUCT_DTO_LIST = new ArrayList<>();

    static {
        ProductDto p1 = new ProductDto(1, "Shirt", 10l);
        ProductDto p2 = new ProductDto(2, "pent", 20l);
        ProductDto p3 = new ProductDto(3, "t-Shirt", 30l);
        PRODUCT_DTO_LIST.add(p1);
        PRODUCT_DTO_LIST.add(p2);
        PRODUCT_DTO_LIST.add(p3);
    }

    static {
        PRODUCT_INVENTORY.put(1, 10);
        PRODUCT_INVENTORY.put(2, 20);
        PRODUCT_INVENTORY.put(3, 30);
    }

    public boolean updateProductInventory(Integer id, Integer qty) {
        if (PRODUCT_INVENTORY.containsKey(id)) {
            Integer val = PRODUCT_INVENTORY.get(id);
            if (val >= qty) {
                Integer newQty = val - qty;
                PRODUCT_INVENTORY.put(id, newQty);
            } else {
                log.info("Request qty is higher then inventoyr");
            }
        } else {
            log.info("product not present in inventory ");
        }

        return false;
    }
}
