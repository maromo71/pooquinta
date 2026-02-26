public class Aluno {
    //1. Definir atributos
    public int ra;
    public String nome;
    public String email;
    public String turma;


    //2. Definir os métodos
    public void matricular(){
        System.out.println("Aluno " + nome +
                " matriculado com sucesso!");
        System.out.println("Seu RA eh: " + ra);
    }

    public void cancelarMatricula(){
        System.out.println("Aluno " + nome +
                " sua matricula foi cancelada!");
    }
}
