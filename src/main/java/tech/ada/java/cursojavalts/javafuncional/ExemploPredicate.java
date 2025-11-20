package tech.ada.java.cursojavalts.javafuncional;

import java.util.function.Predicate;

public interface ExemploPredicate {
    public static void main(String[] args) {
        Predicate<String> isLong = str -> str.length() <= 10;
        //predicate é uma interface funcional que retorna algo

        System.out.println(isLong.test("Uma String"));
        System.out.println(isLong.test("Uma String Longa"));
    }
}
