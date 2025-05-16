package academy.devdojo.maratonajava.introducao;

public class Aula05Operadores
{
    public static void main(String[] args) {
        // Operadores aritméticos:
        // + - / *
        int numero1 = 10;
        double numero2 = 20;
        double multiply = numero1 * numero2;
        double sum = numero1 + numero2;
        double diff = numero1 - numero2;
        double divide = numero1 / numero2;

        System.out.println("Multiplicação = " + multiply); 
        System.out.println("Soma = " + sum);
        System.out.println("Diferença = " + diff);
        System.out.println("Divisão = " + divide);

        // %
        int resto = 21 % 7;
        System.out.println("Resto = " + resto);

        // Operadores relacionais:
        // < > >= <= == !=
        boolean isTenGreaterThanTwenty = 10 >= 20;
        System.out.println("\n10 é maior que 20? -> " + isTenGreaterThanTwenty);

        boolean isTenEqualsTen = 10 == 10;
        System.out.println("10 é igual a 10? -> " + isTenEqualsTen);

        boolean isTenDiffTen = 10 != 10;
        System.out.println("10 é diferente de 10? -> " + isTenDiffTen);

        // Operadores lógicos:
        // AND && / OR ||
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLei = idade >= 30 && salario >= 4600;
        System.out.println("É maior de 30 e tem salário maior/igual a 4600? -> " + isDentroDaLei);

        double valorContaCorrente = 200;
        double valorContaInvestimentos = 10000;
        float valorPlaystation = 3500F;
        boolean isPlaystationBuyable = valorContaCorrente > valorPlaystation || valorContaInvestimentos > valorPlaystation;
        System.out.println("O Playstation é compravel? -> " + isPlaystationBuyable);

    }
}
