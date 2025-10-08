package aula7.Ordenador;

public class Ordenador {
    public static void bubbleSort(int[] vetor) {

        int n = vetor.length;
        for (int i = 0; i < n-1; i++) {
            System.out.printf("Posição i: %d\n", i);
            for (int j = 0; j < n-i-1; j++) {
        System.out.printf(" Item  na posição %d é %d e o próximo é %d\n", j, vetor[j], vetor[j+1]);
                if (vetor[j] > vetor[j+1]) {
                    // Troca vetor[j] e vetor[j+1]
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                    System.out.println("Trocou");
                }
                }
            System.out.println("Fim da iteração");
        }
    }

     public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n-1; i++) {
            // Encontra o menor elemento no vetor[i..n-1]
            System.out.printf("Posição i: %d\n", i);
            int indiceMenor = i;
            for (int j = i+1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;      
                }
            }
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
            System.out.println("Fim da iteração");
        }
     }
    }

       
        
    


    
