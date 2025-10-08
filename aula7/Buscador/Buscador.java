package aula7.Buscador;

public class Buscador {
    public static int buscaSequencial(int[] vetor, int busca) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                return i; // Retorna o índice se a chave for encontrada
            }
        }
        return -1; // Retorna -1 se a chave não for encontrada
    }

    public static int buscaBinaria(int[] vetor, int busca) {
     int inicio = 0;
     int fim = vetor.length - 1;
     while (inicio <= fim) {
         int meio = (inicio + fim) / 2;
         if (vetor[meio] == busca) {
             return meio; // Retorna o índice se a chave for encontrada
         } else if (vetor[meio] < busca) {
             inicio = meio + 1; // Busca na metade direita
         } else {
             fim = meio - 1; // Busca na metade esquerda
         }
     }
    return -1; // Retorna -1 se a chave não for encontrada
    }
}
