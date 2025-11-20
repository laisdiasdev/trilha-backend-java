package tech.ada.java.cursojavalts.javafuncional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ExpressaoLambda {
    public static void main(String[] args) {
        Operacao soma = (a,b) -> a+b;
        System.out.println(soma.calcular(10, 20));

        List<String> nomes =
                Arrays.asList("Lucas", "Lucas", "Lucas");
        nomes.forEach(nome -> System.out.println(nome));
    }
}
