package aula11;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;



public class Embarque {
   public static void main(String[] args ){

   
    Queue<Pessoa> filaDeEntrada = new ArrayDeque<>();
    Deque<Pessoa> areaDeEmbarque = new ArrayDeque<>();

        filaDeEntrada.offer(new Pessoa("Luis"));
        filaDeEntrada.offer(new Pessoa("David"));
        filaDeEntrada.offer(new Pessoa("Marco"));
        filaDeEntrada.offer(new Pessoa("José"));
        filaDeEntrada.offer(new Pessoa("Pedro"));
        filaDeEntrada.offer(new Pessoa("Thais"));
        filaDeEntrada.offer(new Pessoa("Andressa"));

         while (!filaDeEntrada.isEmpty()) {
            System.out.println("Próxima viagem com 4 passageiros");
            for(int i = 0; i < 4 && !filaDeEntrada.isEmpty(); i++){
                System.out.println("A pessoa " + filaDeEntrada.peek().getNome() + " está embarcando");
                Pessoa p = filaDeEntrada.poll();
                areaDeEmbarque.push(p);
            }
            System.out.println("Passageiros entrando e sentando de trás para a frente");
            while (!areaDeEmbarque.isEmpty()) {
                Pessoa p = areaDeEmbarque.pop();
                System.out.println("A pessoa " + p.getNome()  + "  sentou no ônibus");
                 }
                 System.out.println("Embarque concluido");
            
        }
   }
}