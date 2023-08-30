package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation addition = new Addition();
        Operation substraction = new Substraction();
        Operation exponentiation = new Exponentiation();

        System.out.println("Addition: " + calculator.execute(addition, 5, 6));
        System.out.println("Substraction: " + calculator.execute(substraction, 134, 77));
        System.out.println("Exponentiation: " + calculator.execute(exponentiation, 2, 3));
    }
}