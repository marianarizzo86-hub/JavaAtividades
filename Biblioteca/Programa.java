package Biblioteca;

public class Programa {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "Brasileira");
        

        Livro livro1 = new Livro("Dom Casmurro", 1899, autor);
      

        System.out.println("Livro: " + livro1.titulo + ", Ano de Publicação: " + livro1.anoPublicacao);
        System.out.println("Autor: " + livro1.autor.nome + ", Nacionalidade: " + livro1.autor.nacionalidade);
    }
}
