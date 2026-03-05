import java.util.Scanner;

public class Teste2 {
    //Criar um objeto Funcionario, chamado: funcionario
    //Vou pedir os dados para o usuario (Scanner)
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Digite o salario atual: ");
        funcionario.salario = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor do % de aumento: ");
        double perc = Double.parseDouble(sc.nextLine());
        //invocar o metodo aumentar salario passando o perc digitado
        funcionario.aumentarSalario(perc);
        //mostrar os dados do funcionario
        funcionario.imprimir();
    }
}
