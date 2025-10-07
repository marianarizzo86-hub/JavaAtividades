package TimeDeFutebol;
public class Programa {
            

public static void main(String[] args) {
    TimeDeFutebol meuTime = new TimeDeFutebol("Campeões FC");
    String nome, posicao;
    int tamanhoDoTime = 3;
    java.util.Scanner sc = new java.util.Scanner(System.in);

    for (int i = 0; i < tamanhoDoTime; i++) {
        System.out.println("Digite o nome do jogador " + (i + 1) + ":");
       nome = sc.nextLine();
        System.out.println("Digite a posição do jogador " + (i + 1) + ":");
        posicao = sc.nextLine();

        Jogador jogador = new Jogador(nome, posicao);
        meuTime.adicionarJogador(jogador);
    }
    meuTime.exibirEscalacao();
    sc.close();

}
}

