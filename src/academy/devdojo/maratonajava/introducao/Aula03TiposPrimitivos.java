package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivos
{
    public static void main(String[] args) {
        int idade = 10;
        long numeroLongo = 100000;
        double salarioDouble = 20000;
        float salarioFloat = 2500;
        byte idadeByte = 127;
        short idadeShort = 9;
        boolean verdadeiro = true;
        boolean falso = false;

        // Números no tipo char são convertidos de acordo com a tabela ASCII
        char caracter = 65;

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(falso);
        System.out.println("char: " + caracter);
    }
}
