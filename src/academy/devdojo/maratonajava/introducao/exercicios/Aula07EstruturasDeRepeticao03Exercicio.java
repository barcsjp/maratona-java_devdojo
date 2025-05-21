package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Aula07EstruturasDeRepeticao03Exercicio {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição: valorParcela >= 1000
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o valor do carro que deseja comprar? -> ");
        double valorCarro = input.nextInt();

        for (int parcela = 1; parcela <= valorCarro; parcela++)
        {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000)
            {
                break;
            }
            System.out.println("Dividido em " + parcela + " parcela(s): " + " R$" + valorParcela);

        }
    }
}
