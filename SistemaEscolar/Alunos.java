package SistemaEscolar;

public class Alunos {
    String nome;
    int matricula;  
    double notaFinal;

    void verificaAprovacao() {
        if (notaFinal >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    void apresentarDados(){
        System.out.println("Aluno: " + nome + ", matrícula: "  + matricula + ", nota final: " + notaFinal);
    }
}

