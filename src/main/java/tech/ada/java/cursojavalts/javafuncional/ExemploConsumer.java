package tech.ada.java.cursojavalts.javafuncional;

import java.util.function.Consumer;

public class ExemploConsumer {
    // usada quando se quer realizar uma ação com os dados
    public static void main(String[] args) {
        Consumer<String> imprimirNome =
                nome -> System.out.println(nome);
        imprimirNome.accept("Lucas");
    }
}
