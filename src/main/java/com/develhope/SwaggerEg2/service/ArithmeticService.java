package com.develhope.SwaggerEg2.service;

import com.develhope.SwaggerEg2.entities.ArithmeticOperation;
import org.springframework.beans.factory.annotation.Autowired;

public class ArithmeticService {

    @Autowired
    ArithmeticOperation arithmeticOperation;
    public ArithmeticOperation divisionInfo(){

        return new ArithmeticOperation();



    }


}
