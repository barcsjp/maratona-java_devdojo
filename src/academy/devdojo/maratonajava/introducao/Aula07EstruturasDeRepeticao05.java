package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição: valorParcela >= 1000
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o valor do carro que deseja comprar? -> ");
        double valorCarro = input.nextInt();

        for (int parcela = (int) valorCarro; parcela >= valorCarro; parcela--)
        {
            double valorParcela = valorCarro/ parcela;
            if (valorParcela < 1000)
            {
                continue;
            }
            // Enquanto o valor da parcela estiver menor que 1000, o sout abaixo vai ser ignorado pelo continue.
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
