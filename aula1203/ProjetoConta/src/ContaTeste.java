import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    static void main() {
        Scanner sc = new Scanner(System.in);
        ContaTeste teste = new ContaTeste();
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar");
            System.out.println("9. SAIR");
            System.out.println("Digite sua opcao:");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1 -> teste.execCadastrar();
                case 2 -> teste.execDepositar();
                case 3 -> teste.execSacar();
                case 4 -> teste.execConsultar();
                case 9 -> System.out.println("FIM");
                default -> System.out.println("Opcao invalida");
            }
        }while(opcao != 9);//diferente 9, volta no menu
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastrando dados da conta");
        System.out.println("Digite o numero da conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Digite o nome da agencia: ");
        cc.agencia = sc.nextLine();
        System.out.println("Cadastro efetuado com sucesso.");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        double valorSaque;
        System.out.println("Digite o valor do Saque: ");
        valorSaque = Double.parseDouble(sc.nextLine());
        boolean deuCerto = cc.sacar(valorSaque);
        if(deuCerto){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente para o saque");
        }
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        double valorDeposito;
        System.out.println("Digite o valor do deposito: ");
        valorDeposito = Double.parseDouble(sc.nextLine());
        cc.depositar(valorDeposito);
        System.out.println("Valor depositado com sucesso");
    }
}
