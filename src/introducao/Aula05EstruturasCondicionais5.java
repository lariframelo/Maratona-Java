package introducao;
// swich
public class Aula05EstruturasCondicionais5 {
    public static void main(String[] args) {
        //Imprima um dia da semana, considerando 1 como domingo
        byte dia = 1;

        // variáveis que podem ir dentro do switch
        // char, int, byte, short, enum, string
        switch (dia) {
            default:
                System.out.println("Opção Inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

        }
    }
}
