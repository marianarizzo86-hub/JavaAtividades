public class VerificadorDiaDaSemana {
    public static void main(String[] args) {
        
    
    int diaDaSemana = 4;
    switch (diaDaSemana){
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:

        System.out.println("Dia Útil");
        break;
        case 1:
        case 7:
        System.out.println("Final de semana");
        break;
        default:
        System.out.println("Número inválido. Insira um valor de 1 a 7");
    }
}
}

