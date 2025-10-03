package Correios;

public class Programa {
    public static void main(String[] args) {
       Endereco endJoao = new Endereco();
         endJoao.rua = "Rua das flores";
         endJoao.numero = 123;
         endJoao.cep = "25680-000";
         endJoao.Cidade = "Petrópolis";

         Pessoa joao = new Pessoa();
         joao.nome = "João Carlos";
            joao.cpf = "123.456.789-00";
            joao.endereco = endJoao;        
            System.out.println("O " + joao.nome + "mora na cidade de " + joao.endereco.Cidade);
    }
}
