package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc = new Calculator("Ti84");
        //2. call any methods of that class to test
        double operation = calc.performOperation("+", -5, 6);
        System.out.println(operation);
        
        boolean trueFalse = calc.divisibleBy(-5, 6);
        System.out.println(trueFalse);

        String coords = calc.coordinatePair(-5, 6);
        System.out.println(coords);
        
        int absValue = calc.absoluteValue(-5, 6);
        System.out.println(absValue);

        String information = calc.info();
        System.out.println(information);
        
    }
}
