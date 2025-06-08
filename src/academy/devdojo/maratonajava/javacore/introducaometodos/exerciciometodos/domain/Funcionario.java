package academy.devdojo.maratonajava.javacore.introducaometodos.exerciciometodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimirDados(){
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário: " + this.idade);
        System.out.println("Histórico Salarial: ");
        for (double salario : salarios){
            System.out.println(salario);
        }
        calcularMediaSalarial();

    }

    public void calcularMediaSalarial(){
        double soma = 0;
        for (double salario : this.salarios){
            soma += salario;

        }
        double media = soma / salarios.length;
        System.out.println("--------");
        System.out.println("Média:");
        System.out.println("Salários considerados: " + salarios[0] + " " + salarios[1] + " " + salarios[2]);
        System.out.printf("Média salarial: %.2f", media);
    }
}
