package com.datastructures;

import java.util.ArrayList;
import java.util.List;
interface Fruit{
    default void type(){
        System.out.println("Mango");
    }

}
interface Vegetable{
    default void type(){
        System.out.println("Cabbage");
    }
    public void print();
}

class MultipleInheritence implements Fruit, Vegetable{
    public void type(){
        Fruit.super.type();
        Vegetable.super.type();
    }

    @Override
    public void print() {

    }

    public static void main(String[] args) {
        MultipleInheritence inherit = new MultipleInheritence();
        inherit.type();
        Fruit f = new MultipleInheritence();
        f.type();
    }

}
