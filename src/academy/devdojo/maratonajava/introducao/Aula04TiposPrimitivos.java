package academy.devdojo.maratonajava.introducao;

public class Aula04TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.45F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, eu sou o " + nome);
    }
}
