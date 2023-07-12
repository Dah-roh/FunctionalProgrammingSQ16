package org.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {




    public String printName(String name){
        return "Hello, "+name;
    }
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        //Functional Interface, TriFunctional, BiFunctional
        Function<String, String> printName = name ->  "Hello, "+name;
        Function<String, Integer> printStringLength = string -> string.length();
        System.out.println(printStringLength.apply("Gadibia"));
        System.out.println(printName.apply("Ibrahim"));

        //Consumer Interface, BiConsumer
        Consumer<String> printString = System.out::println;
        printString.accept("Hello world!");

        //Supplier Interface
        Supplier<Integer> displayString = "Hello, Gadibia."::length;
        System.out.println(displayString.get());

        //Predicate Interface: Supplement for if-statements
        Predicate<String> isLessThan5 = string -> string.length()<5;
        System.out.println(isLessThan5.test("Internationalization"));

    }
}