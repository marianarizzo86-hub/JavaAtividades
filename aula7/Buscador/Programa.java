package aula7.Buscador;

public class Programa {
    public static void main(String[] args) {
        int[] vetor = {2,5,18,30,77};
        int busca = 30;
        int resultado = Buscador.buscaBinaria(vetor, busca);
        if (resultado != -1) {
            System.out.printf("Elemento %d encontrado na posição %d\n", busca, resultado);
        } else {
            System.out.printf("Elemento %d não encontrado no vetor\n", busca);
        }
    }
}
