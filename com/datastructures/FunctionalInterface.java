package com.datastructures;

@java.lang.FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {
        //Using method reference instead of Lambda expression
        //This expression implements 'IMathFunction' Interface
        IMathFunction add = Integer::sum;

        IMathFunction multiply = (x,y) -> x*y;
    }
}
