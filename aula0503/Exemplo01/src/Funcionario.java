public class Funcionario {
    public String nome;
    public double salario;

    public void aumentarSalario(double percentual){
        salario = salario + (salario * percentual / 100);
    }

    public void imprimir(){
        System.out.println("Nome = " + nome);
        System.out.println("Salario = " + salario);
    }
}
