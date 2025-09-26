import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        //1. Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //2. Declara um vetor de String com 5 posições para armazenar os itens
        String[] itens = new String[5];

        System.out.println("Por favor , digite os 5 itens da sua lista de compras.");


        //3. usa um laço "for" para solicitar cada item ao usuário

        for (int i = 0; i < itens.length; i++){
            System.out.println("Digite o item" + (i + 1) + ": ");

        //Armazena o item digitado no vetor 
            itens[i] = scanner.nextLine();  
        }
            
                //4. Exibe a lista completa de forma organizada
                
                System.out.println("\n--- Sua Lista de Compras ---");
                for (int j = 0; j < itens.length; j++){
                    System.out.println((j + 1) + ". " + itens[j]);
                }
                System.out.println("--------------------");
                
                //5. Fecha o scanner para liberar recursos 
                scanner.close();

    }
}

