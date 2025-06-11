package academy.devdojo.maratonajava.javacore.sobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int qtdEpisodios;

    public void init(String nome, String tipo, int qtdEpisodios){
        this.nome = nome;
        this.tipo = tipo;
        this.qtdEpisodios = qtdEpisodios;
    }

    public void init(String nome, String tipo, String genero, int qtdEpisodios){
        this.init(nome, tipo, qtdEpisodios);
        this.qtdEpisodios = qtdEpisodios;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
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
