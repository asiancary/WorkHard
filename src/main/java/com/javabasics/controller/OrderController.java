package com.javabasics.controller;

import com.javabasics.Bean.Farmer;
import com.javabasics.Bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String oderForm(Farmer farmer){
        farmer.setMPerson(new Person());

        return "succed";
    }



}
