package academy.devdojo.maratonajava.javacore.introducaometodos.exerciciometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.exerciciometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        double[] salarios = {3241.45, 4567.12, 6522.03};
        funcionario.setNome("Jonas");
        funcionario.setIdade(32);
        funcionario.setSalarios(salarios);

        funcionario.imprimirDados();
        System.out.println("\nMédia: " + funcionario.getMedia());

    }
}
