package com.shopingcart.service.impl;

import com.shopingcart.common.Utils;
import com.shopingcart.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("purchaseService")
public class PurchaseServiceImp implements PurchaseService {
    @Autowired
    private Utils utils;

    @Override
    public boolean orderProduct(Integer id, Integer qty) {

       return utils.updateProductInventory(id, qty);
    }
}
