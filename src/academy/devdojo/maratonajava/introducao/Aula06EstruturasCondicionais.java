package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais {
    public static void main(String[] args) {
        // Idade < 15: Categoria Infantil
        // Idade >= 15 && < 18: Categoria Juvenil
        // Idade >= 18: Categoria Adulto

        String categoria;
        int idade = 14;
        boolean isJuvenil = idade >= 15 && idade < 18;
        boolean isInfantil = idade < 15;

        if (isInfantil)
        {
            categoria = "Categoria Infantil";
        }
        else if (isJuvenil)
        {
            categoria = "Categoria Juvenil";
        }
        else // idade > 18
        {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
