package academy.devdojo.maratonajava.javacore.introducaoclasses.exercicios.ExercicioClasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.exercicios.ExercicioClasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro mustang = new Carro();
        mustang.marca = "Ford";
        mustang.modelo = "Mustang GT Perfomance V8";
        mustang.ano = 2025;
        System.out.println("Marca: " + mustang.marca + " | Modelo: " + mustang.modelo + " | Ano: " + mustang.ano);

        Carro fastback = new Carro();
        fastback.marca = "Fiat";
        fastback.modelo = "Fastback Abarth T270 AT";
        fastback.ano = 2025;
        System.out.println("Marca: " + fastback.marca + " | Modelo: " + fastback.modelo + " | Ano: " + fastback.ano);
    }
}
