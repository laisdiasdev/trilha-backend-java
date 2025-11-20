package tech.ada.java.cursojavalts.javafuncional;

import java.util.function.Supplier;

public class ExemploSupplier {
    public static void main(String[] args) {
        Supplier<String> fornecedor =
                () -> "Uma String";
        System.out.println(fornecedor.get());
    }
}
