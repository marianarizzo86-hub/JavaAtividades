public class MediaNotas {
    public static void main(String[] args) {
        double soma = 0;
        double[] notas = {7.5, -8.0, 6.5, 12.0, 5.5};
        for(int i = 0; i < 5; i++){
            if(notas[i] <= 10 && notas[i] >=0){
                soma = soma + notas[i];
            }
            else{
                continue;
                
            }
        }
        System.out.println("A Média é: " + (soma / 5));
        
    }
}
