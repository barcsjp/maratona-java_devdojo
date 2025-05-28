package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre";
        professor.idade = 55;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
