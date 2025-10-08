package TimeDeFutebol;
// Classe TimeDeFutebol
public class TimeDeFutebol {
        
    String nomeDoTime;
    Jogador[] jogadores = new Jogador[11];
    int quantidadeDeJogadores = 0;
    // Construtor
    public TimeDeFutebol(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
        this.jogadores = new Jogador[11];
        this.quantidadeDeJogadores = 0;

    }
    // Método para adicionar um jogador ao time
    public void adicionarJogador(Jogador novojogador) {
        if (quantidadeDeJogadores < jogadores.length) {
            jogadores[quantidadeDeJogadores] = novojogador;
            quantidadeDeJogadores++;
        } else {
            System.out.println("Time cheio! Não é possível adicionar mais jogadores.");
        }
    }
    // Método para exibir a escalação do time
    public void exibirEscalacao() {
        System.out.println("Escalação do time " + nomeDoTime + ":");
        for (int i = 0; i < quantidadeDeJogadores; i++) {
            System.out.println((i + 1) + ". " + jogadores[i].nome + " - " + jogadores[i].posicao);
        }
    }

   
    
}
