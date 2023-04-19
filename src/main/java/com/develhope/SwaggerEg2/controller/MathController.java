package com.develhope.SwaggerEg2.controller;

import com.develhope.SwaggerEg2.entities.ArithmeticOperation;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/math")
@RestController
public class MathController {


    @GetMapping("")
    public String welcomeMathMsg(){
        return "Hello summoner!";
    }
    @GetMapping("/division-info")
    public ArithmeticOperation divInfo(){
        String [] properties= new String [2];
        properties[0]="invariant";
        properties[1]="distributive";
        return new ArithmeticOperation("division",
                "2",
                "divide the first number for the second",
                properties
                );
    }

    @GetMapping("/multiplication")
    public double multiplication(@RequestParam int n1,
                                 @RequestParam int n2){
        return n1*n2;
    }

    @GetMapping("/square/{n}")
    public Double squareReturns(@PathVariable (value = "n") Double n){
        return n*n;
    }



}
