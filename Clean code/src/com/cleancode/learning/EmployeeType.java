package com.cleancode.learning;

public enum EmployeeType {

    COMMISSIONED("COMMISSIONED"), HOURLY("HOURLY"), SALARIED("SALARIED");

    private  String textValue;

    EmployeeType(String textValue) {
        this.textValue = textValue;
    }

    public static EmployeeType textValueOf(String textValue){

        for(EmployeeType value : values()) {
            if(value.textValue.equals(textValue)) {
                return value;
            }
        }

        throw new IllegalArgumentException("No EnumWithValueOf for value: " + textValue);  
    }   
}
