package com.neuedu.controller;

import com.neuedu.pojo.Cart;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("t")
    public Cart test(){
        Cart cart = new Cart();
        cart.setId(1);
        cart.setChecked(123);
        return cart;
    }



}
