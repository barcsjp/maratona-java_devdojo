package academy.devdojo.maratonajava.introducao.exercicios;

public class Aula07EstruturasDeRepeticao02Exercicio
{
    // Imprima todos os números pares de 0 até 1.000.000;
    // com o laço For
    public static void main(String[] args)
    {
        for (int count = 0; count <= 1000000; count++)
        {
            if (count % 2 == 0){
                System.out.println(count);
            }
        }
    }
}
