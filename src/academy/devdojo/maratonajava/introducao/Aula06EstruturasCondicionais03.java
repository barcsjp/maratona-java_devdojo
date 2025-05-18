package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador ternário
        // Doar if salario > 5000
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
