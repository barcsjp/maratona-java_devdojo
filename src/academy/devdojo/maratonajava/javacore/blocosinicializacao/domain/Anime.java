package academy.devdojo.maratonajava.javacore.blocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int episodio: this.episodios) {
            System.out.println(episodio + " ");
        }
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
