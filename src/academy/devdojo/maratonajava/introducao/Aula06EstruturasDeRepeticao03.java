package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Dado um valor, imprima os seus primeiros 25 números.
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++)
        {
            if (i > 25)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
