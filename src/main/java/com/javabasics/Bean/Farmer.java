package com.javabasics.Bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Farmer {
    private String Type;
    private String name;
    @Autowired

    private Person mPerson;


}
