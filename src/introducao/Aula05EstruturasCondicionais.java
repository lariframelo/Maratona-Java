package introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 26;
        boolean autorizado = idade >=18;
        if (autorizado) {
            System.out.println("Liberado");
        }
        if (!autorizado) { //essa é uma outra forma de substituir o else
            System.out.println("Negado");
        }
    }
}
