package org.example;

public class Exponentiation implements Operation {
    @Override
    public int apply(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
