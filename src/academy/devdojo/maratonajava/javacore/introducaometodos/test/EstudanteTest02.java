package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';
        estudante.imprime();

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';
        estudante2.imprime();

    }
}
