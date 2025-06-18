package academy.devdojo.maratonajava.javacore.modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.modificadorestatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        carro1.imprimir();

        Carro carro2 = new Carro("Mercedes", 275);
        carro2.imprimir();

        Carro carro3 = new Carro("Audi", 290);
        carro3.imprimir();
    }
}
