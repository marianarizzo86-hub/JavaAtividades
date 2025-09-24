public class CalculadoraSalario {
    public static void main(String[] args) {
        String nome = "Maria";
        double salario = 2500.0;

        if(salario <= 1751.81){
            System.out.println("O funcionário " + nome + " tem um sálario de R$ " + salario + " e terá desconto de 8% da sua renda.");
        
        }
        else if(salario >= 1751.82 && salario <= 2919.72){
            System.out.println("O funcionário " + nome + " tem um sálario de R$ " + salario + " e terá desconto de 9% da sua renda.");

        }
        else if(salario >= 2919.73 && salario <= 5839.45){
            System.out.println("O funcionário " + nome + " tem um sálario de R$ " + salario + " e terá desconto de 18% da sua renda.");

        }else {
            System.out.println("O funcionário " + nome + " tem um sálario de R$ " + salario + " e terá desconto de 11% da sua renda.");
        }
        }
    }

