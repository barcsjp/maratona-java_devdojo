package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Aula06EstruturasCondicionas05Exercicio {
    public static void main(String[] args) {
        // Utilizando Switch-Case
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // considerando 1 como domingo.

        Scanner input = new Scanner(System.in);

        System.out.println("Os dias vão de 1 a 7, considerando 1 como domingo!");
        System.out.print("Insira o um número: ");
        byte dia = input.nextByte();
        switch (dia)
        {
            case 1:
                System.out.println("Domingo é final de semana.");
                break;
            case 2:
                System.out.println("Segunda é dia útil.");
                break;
            case 3:
                System.out.println("Terça é dia útil.");
                break;
            case 4:
                System.out.println("Quarta é dia útil.");
                break;
            case 5:
                System.out.println("Quinta é dia útil.");
                break;
            case 6:
                System.out.println("Sexta é dia útil.");
                break;
            case 7:
                System.out.println("Sábado é final de semana.");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }

    }
}
