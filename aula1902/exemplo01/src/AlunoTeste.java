public class AlunoTeste {
    public static void main(String[] args) {
        // 1. Programa deve criar dois alunos
        // 2. Matricular os alunos
        // 3. Cancelar a matricula do segundo aluno

        //1
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //2
        aluno1.ra = 101;
        aluno1.nome = "Joao Carlos";
        aluno1.email = "joaocarlos@gmail.com";
        aluno1.turma = "Quarto Periodo ADS";

        aluno1.matricular();

        aluno2.ra = 202;
        aluno2.nome = "Pedro Silva";
        aluno2.email = "pedrosilva@gmail.com";
        aluno2.turma = "Quarto Periodo ADS";

        aluno2.matricular();

        //3
        aluno2.cancelarMatricula();
    }
}
