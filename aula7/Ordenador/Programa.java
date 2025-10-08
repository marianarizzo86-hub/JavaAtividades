package aula7.Ordenador;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = {30,18,77,2,5};
        Ordenador.bubbleSort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor na posição %d é %d", i, vetor[i]);
        }
        
    
    }
}
