package com.develhope.SwaggerEg2.entities;

import io.swagger.v3.oas.annotations.media.Schema;



public class ArithmeticOperation {

    @Schema(name ="The name of the arithmetic operation",format = "String", example = "Division")
    String name;
    @Schema(name ="Minium number of operands that are necessary", format = "String", example="2")
    String minNumberOfOperands;
    @Schema(name = "The description of operation", format = "String", example = "this operation adds the first number to the second")
    String description;
    @Schema(name ="properties", format =" String Array",example = "[invariant,distributive]")
    String [] properties;

    public ArithmeticOperation(String name, String minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

    public ArithmeticOperation(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public void setMinNumberOfOperands(String minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
