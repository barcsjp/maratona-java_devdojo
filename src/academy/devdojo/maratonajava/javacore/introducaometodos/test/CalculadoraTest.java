package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        System.out.println("Finalizando CalculadoraTest");
        calculadora.subtraiDoisNumeros();
    }
}
