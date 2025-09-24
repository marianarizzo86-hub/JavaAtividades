public class ConversorDeMoeda{

    public static void main(String[] args){

        double taxaDeCambio = 5.25;
        double valorEmDolar = 50.0;
        double valorEmReais = valorEmDolar * taxaDeCambio;

        System.out.println("O valor em reais é : " + valorEmReais);
    }
}
