package academy.devdojo.maratonajava.javacore.construtores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private String estudio;
    private int qtdEpisodios;

    public Anime(String nome, String tipo, String genero, int qtdEpisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.qtdEpisodios = qtdEpisodios;
    }

    public Anime(String nome, String tipo, String genero, int qtdEpisodios, String estudio){
        this(nome, tipo, genero, qtdEpisodios);
        this.estudio = estudio;

    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.estudio);
        System.out.println(this.qtdEpisodios);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setQtdEpisodios(int qtdEpisodios){
        this.qtdEpisodios = qtdEpisodios;
    }

    public int getQtdEpisodios(){
        return qtdEpisodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }


}
