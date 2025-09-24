public class SituacaoAluno {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 6.0;
        double media = ( nota1 + nota2)/ 2;
       
        if (media == 10 ){
            System.out.println("Aluno Aprovado parabéns");
        }
        else if (media >= 7 ){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Reprovado");
            }
        }
    }

