package academy.devdojo.maratonajava.javacore.introducaometodos.exerciciometodos.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

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
        this.media = soma / salarios.length;
        System.out.println("--------");
        System.out.println("Média:");
        System.out.println("Salários considerados: " + salarios[0] + " " + salarios[1] + " " + salarios[2]);
        System.out.printf("Média salarial: %.2f", media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
