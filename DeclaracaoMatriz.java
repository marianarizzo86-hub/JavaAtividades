public class DeclaracaoMatriz {
    public static void main(String[] args) {
        int [][]tabela = {{1,2,3},{3,2,1},{4,5,6},{3,4,5}};
        for (int linha = 0; linha < tabela.length; linha ++){
            for (int coluna = 0; coluna < tabela[linha].length; coluna++ ){
                System.out.println(tabela[linha][coluna]+"\t");
            }
            System.out.println();
        }
    }
}
