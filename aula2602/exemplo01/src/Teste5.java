import java.util.Scanner;

public class Teste5 {
    //A ideia aqui é usar um switch aprimora que devolve um
    //valor referente a escolha do usuario
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu de Refri");
        System.out.println("1. Coca-cola");
        System.out.println("2. Fanta");
        System.out.println("3. Guarana");
        System.out.println("4. Sair");
        System.out.println("Digite sua opcao: ");
        int opcao = Integer.parseInt(input.nextLine());
        double valor = switch (opcao){
            case 1 -> {
                System.out.println("Escolhe Coca-cola");
                yield 6.89;
            }
            case 2 -> {
                System.out.println("Escolhe Fanta");
                yield 4.78;
            }
            case 3 -> {
                System.out.println("Escolhe Guarana");
                yield 3.65;
            }
            default -> {
                System.out.println("Opcao invalida");
                yield 0.0;
            }
        };
        System.out.println("Valor a pagar no caixa R$ "  + valor);
    }
}
