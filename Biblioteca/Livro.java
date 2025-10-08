package Biblioteca;
// Classe Livro
public class Livro {
    int anoPublicacao;
    String titulo;
    Autor autor;
    // Construtor
    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }
}
