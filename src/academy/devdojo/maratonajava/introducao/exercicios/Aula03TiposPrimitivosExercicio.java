package academy.devdojo.maratonajava.introducao.exercicios;

public class Aula03TiposPrimitivosExercicio {
    /*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>.
     */

    // Até agora foram apresentados os tipos primitivos e a classe String.

    // Solução:

    public static void main(String[] args)
    {
        String employeeName = "Jonas";
        String employeeAdress = "Rua Tomatinho";
        String paymentDate = "24/06/2024";
        double employeeWage = 2567.23;

        System.out.println("Eu " + employeeName + ", morando no endereço " + employeeAdress + ",");
        System.out.print("confirmo que recebi o salário de R$" + employeeWage + ", na data " + paymentDate + ".");
    }
}
