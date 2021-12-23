package com.javabasics.controller;

import com.javabasics.Service.ShoesModelDao;
import org.springframework.stereotype.Controller;

@Controller
public class BusinessShopShoesController {
//   @Autowired
    private ShoesModelDao shoesModelDao;




   public void test(){
       shoesModelDao = new ShoesModelDao();

   }


}
