import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);
        System.out.println("Digite seu salario: ");
        double salario = Double.parseDouble(sc.nextLine());
        double novoSalario = salario * 1.15;
        System.out.println("Novo Salario: " + novoSalario);
    }
}
