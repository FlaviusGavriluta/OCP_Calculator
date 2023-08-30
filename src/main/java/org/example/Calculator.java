package org.example;

public class Calculator {
    public int execute(Operation operation, int a, int b) {
        return operation.apply(a, b);
    }
}