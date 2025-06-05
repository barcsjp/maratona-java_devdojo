package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        Estudante estudante = new Estudante();
        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';
        impressora.imprime(estudante);

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';
        impressora.imprime(estudante2);

    }
}
