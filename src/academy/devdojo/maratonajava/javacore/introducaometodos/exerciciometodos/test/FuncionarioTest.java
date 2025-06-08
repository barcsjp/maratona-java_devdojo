package academy.devdojo.maratonajava.javacore.introducaometodos.exerciciometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.exerciciometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        double[] salarios = {3241.45, 4567.12, 6522.03};
        funcionario.nome = "Jonas";
        funcionario.idade = 32;
        funcionario.salarios = salarios;

        funcionario.imprimirDados();
    }
}
