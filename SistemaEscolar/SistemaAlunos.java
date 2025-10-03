package SistemaEscolar;
import java.util.Scanner;

public class SistemaAlunos {
    
    public  static void main(String[] args) {    
        Alunos[] alunos = new Alunos[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Alunos();
            System.out.println("Digite o nome do aluno");
            alunos[i].nome = scanner.nextLine();
            
            System.out.println("Digite a matrícula do aluno");
            alunos[i].matricula = scanner.nextInt();

            System.out.println("Digite a nota final do aluno");
            alunos[i].notaFinal = scanner.nextDouble();
            scanner.nextLine(); 
        }

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].verificaAprovacao();
            alunos[i].apresentarDados();

        }


        scanner.close();
    }   
    
}
