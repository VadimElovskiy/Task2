package com.company;

import Calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calcObj = new Calculator();
        calcObj.initInput();
        calcObj.initVariablesFromInput();
        System.out.println(calcObj.evaluate());

    }
}
