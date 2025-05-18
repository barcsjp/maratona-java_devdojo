package academy.devdojo.maratonajava.introducao.exercicios;

import java.util.Scanner;

public class Aula06EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        // Lower bracket: 0 to 34712 -> 9.70% tax
        // Mid-bracket: 34713 to 68507 -> 37,35% tax
        // Upper bracket: >= 68508 -> 49,50% tax

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o seu salário anual? -> ");
        double yearIncome = input.nextDouble();
        double taxValue;

        boolean isLowerBracket = yearIncome >= 0 && yearIncome <= 34712;
        boolean isMidBracket = yearIncome >= 34713 && yearIncome <= 68507;

        double taxLowerBracket = 9.70/100;
        double taxMidBracket = 37.35/100;
        double taxUpperBracket = 49.50/100;

        if (isLowerBracket)
        {
            taxValue = yearIncome * taxLowerBracket;
        }
        else if (isMidBracket) {
            taxValue = yearIncome * taxMidBracket;
        }
        else // isUpperBracket
        {
            taxValue = yearIncome * taxUpperBracket;
        }
        System.out.println("Salário do usuário: " + yearIncome);
        System.out.printf("Taxa a pagar: %.2f ", taxValue);

        input.close();
    }
}
