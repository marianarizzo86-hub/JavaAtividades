public class ClassificadorDeIdade {
    public static void main(String[] args) {
        int idade = 17; 

        if (idade<12){
            System.out.println("A pessoa é uma criança. ");
        }else if (idade <18){
            System.out.println("A pessoa é um adolescente.");
        }else if (idade >=18 && idade <= 65 ){
            System.out.println("A pessoa é um adulto.");
        }else if (idade >=65){
            System.out.println("A pessoa é um Idoso(a).");
        }else {
            System.out.println("Idade inválida. ");
        }
        }
    }
