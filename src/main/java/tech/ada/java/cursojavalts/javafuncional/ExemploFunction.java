package tech.ada.java.cursojavalts.javafuncional;


import java.util.function.Function;

public class ExemploFunction {
    public static void main(String[] args) {
        Function<String, Integer> stringSize = str -> str.length();

        System.out.println(stringSize.apply("Texto"));
    }
}
