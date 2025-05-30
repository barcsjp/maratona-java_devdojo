package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais05 {
    // Imprima o dia da semana, considerando 1 como domingo.
    public static void main(String[] args) {
        byte dia = 5;

        // Switch só aceita variáveis do tipo char, int, byte, short, enum, String
        // Depois de cada um dos casos é adequado colocar break; para executar apenas
        // o valor correspondente.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }

        char sexo = 'M';
        switch (sexo)
        {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }
}
